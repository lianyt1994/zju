package cn.zju.service;

import cn.zju.bean.Cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartService {
    public List<Cart> selectCartsByUser(String user);

    public Cart selectItemsByUserAndProduct(String user, Integer productId);

    public void updateItem(String user,Integer productId,Integer amount);

    public void insertCartItem(String user,Integer productId,Integer amount);

    public void deleteItem(String user,Integer productId);
}
