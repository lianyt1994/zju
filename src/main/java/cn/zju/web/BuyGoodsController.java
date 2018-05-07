package cn.zju.web;

import cn.zju.service.BuyGoodsService;
import cn.zju.service.ProductService;
import cn.zju.utils.JedisUtils;
import cn.zju.utils.pagination.Pagination;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
@RequestMapping(value = "/")
public class BuyGoodsController {

    @Autowired
    private BuyGoodsService buyGoodsService;

    @Autowired
    private ProductService productService;

    @RequestMapping(value = {"/buyGoods/buyGoods","/"})
    public String goToBuyGoods(String search, Boolean isDel, Integer pageNo, Model model){
        if (pageNo == null)pageNo=1;
        Pagination pagination = null;
        if(search != null)pagination = productService.SelectProductList(search, true, pageNo);
        else pagination = productService.SelectProductList(null, true, pageNo);
        model.addAttribute("pagination", pagination);
        model.addAttribute("search", search);
        model.addAttribute("isDel", isDel);
        return "buyGoods/index";
    }


}
