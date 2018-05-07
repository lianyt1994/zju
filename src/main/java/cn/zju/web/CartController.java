package cn.zju.web;

import cn.zju.bean.Cart;
import cn.zju.bean.ProductProduct;
import cn.zju.service.CartService;
import cn.zju.service.ProductService;
import cn.zju.utils.SessionUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping(value = "/")
public class CartController {
    @Autowired
    private CartService cartService;

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/cart/cart")
    public String goToCart(HttpServletRequest request,
                           HttpServletResponse response, Model model) {
        //先判断用户是否登录，如果没登录返回登录页面
        String userName = SessionUtils.getSessionId(request, response);
        if (userName == null || userName.equals("")) {
            return "/login/login";
        }
        //获取用户在数据库中的购物车项
        List<Cart> carts = cartService.selectCartsByUser(userName);
        for (Cart cart : carts) {
            ProductProduct productProduct = productService.selectProductById(Long.valueOf(cart.getProductId()));
            cart.setProductName(productProduct.getName());
            cart.setPackageList(productProduct.getPackageList());
        }

        /*Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().substring(0, 7).equals("zjuCart")) {
                Boolean flag = true;
                String cookieProductId = cookie.getName().substring(7);
                for (Cart cart : carts) {
                    if (cookieProductId.equals(cart.getProductId())) {
                        cart.setAmount(cart.getAmount() + Integer.parseInt(cookie.getValue()));
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    carts.add(new Cart(userName, Integer.parseInt(cookieProductId), Integer.parseInt(cookie.getValue())));
                }
            }
        }*/

        /*for (Cart cart : carts) {
            if (null != cartService.selectItemsByUserAndProduct(userName, cart.getProductId())) {
                cartService.updateItem(userName, cart.getProductId(), cart.getAmount());
            } else {
                cartService.insertCartItem(userName, cart.getProductId(), cart.getAmount());
            }
        }*/

        model.addAttribute("carts", carts);

        return "/cart/cart";
    }

    @RequestMapping(value = "/cart/addItem")
    public String addCartItem(Integer productId, HttpServletRequest request, HttpServletResponse response) {
        String userName = SessionUtils.getSessionId(request, response);
        Cart cart = cartService.selectItemsByUserAndProduct(userName, productId);
        ProductProduct productProduct = productService.selectProductById(Long.valueOf(productId));
        if (cart != null)
            cartService.updateItem(userName, productId, cart.getAmount() + 1);
        else
            cartService.insertCartItem(userName, productId, 1);
        return "redirect:/buyGoods/buyGoods";
        /*Integer addResult = 1;
        JSONObject jo = new JSONObject();
        jo.put("addResult",addResult);
        response.setContentType("application/json;charset=UTF-8");
        try {
            response.getWriter().write(jo.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

    @RequestMapping("/cart/addItemInCart")
    public String addItemInCart(Integer productId, HttpServletRequest request, HttpServletResponse response) {
        String userName = SessionUtils.getSessionId(request, response);
        Cart cart = cartService.selectItemsByUserAndProduct(userName, productId);
        if (cart != null)
            cartService.updateItem(userName, productId, cart.getAmount() + 1);
        else
            cartService.insertCartItem(userName, productId, 1);
        return "redirect:/cart/cart";
    }

    @RequestMapping("/cart/reduceItemInCart")
    public String reduceItemInCart(Integer productId, HttpServletRequest request, HttpServletResponse response) {
        String userName = SessionUtils.getSessionId(request, response);
        Cart cart = cartService.selectItemsByUserAndProduct(userName, productId);
        ProductProduct productProduct = productService.selectProductById(Long.valueOf(productId));
        if (cart.getAmount() > 1 )
            cartService.updateItem(userName, productId, cart.getAmount() - 1);
        else
            cartService.deleteItem(userName, productId);
        return "redirect:/cart/cart";
    }

    @RequestMapping("/cart/deleteItemInCart")
    public String deleteItemInCart(Integer[] each, HttpServletRequest request, HttpServletResponse response) {
        String userName = SessionUtils.getSessionId(request, response);
        for (Integer id : each) {
            cartService.deleteItem(userName, id);
        }
        return "redirect:/cart/cart";
    }
}
