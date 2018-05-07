package cn.zju.web;

import cn.zju.bean.Cart;
import cn.zju.bean.ProductProduct;
import cn.zju.service.CartService;
import cn.zju.service.ProductService;
import cn.zju.utils.SessionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping(value = "/")
public class OrdersController {
    @Autowired
    private CartService cartService;

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/orders/orders")
    public String goToOrders(
            HttpServletRequest request,
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


        return "/orders/orders";
    }
}