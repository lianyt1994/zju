package cn.zju.service.impl;

import cn.zju.bean.Cart;
import cn.zju.mapper.CartMapper;
import cn.zju.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartMapper cartMapper;

    public List<Cart> selectCartsByUser(String user) {
        List<Cart> carts = cartMapper.selectItemsByUser(user);
        return carts;

    }

    public Cart selectItemsByUserAndProduct(String user, Integer productId) {
        Cart cart = cartMapper.selectItemsByUserAndProduct(user, productId);
        return cart;
    }

    public void updateItem(String user,Integer productId,Integer amount){
        cartMapper.updateItem(user,productId ,amount );
    }

    public void insertCartItem(String user,Integer productId,Integer amount){
        cartMapper.insertCartItem(user,productId ,amount);
    }

    @Override
    public void deleteItem(String user, Integer productId) {
        cartMapper.deleteItem(user,productId );
    }

}
