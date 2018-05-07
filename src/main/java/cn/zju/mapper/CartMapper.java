package cn.zju.mapper;

import cn.zju.bean.Cart;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface CartMapper {

    public void insertCartItem(@Param(value = "user")String user,@Param(value = "productId")Integer productId
            ,@Param(value = "amount")Integer amount);

    public void updateItem(@Param(value = "user")String user,@Param(value = "productId")Integer productId,
                           @Param(value = "amount")Integer amount);

    public Cart selectItemsByUserAndProduct(@Param(value = "user") String user,@Param(value = "productId")Integer productId);

    public List<Cart> selectItemsByUser(@Param(value = "user") String user);

    public void deleteItem(@Param(value = "user") String user,@Param(value = "productId")Integer productId);

}
