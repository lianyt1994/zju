package cn.zju.service.impl;

import cn.zju.bean.ProductProduct;
import cn.zju.bean.ProductProductExample;
import cn.zju.mapper.ProductProductMapper;
import cn.zju.service.BuyGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyGoodsServiceImpl implements BuyGoodsService{

    @Autowired
    private ProductProductMapper productMapper;

    public List<ProductProduct> QueryAllProducts(){
        ProductProductExample productExample = new ProductProductExample();
        return productMapper.selectByExample(productExample);
    }

    public List<ProductProduct> QueryAllProductsLimit(Long offset,Long limit){
        ProductProductExample productExample = new ProductProductExample();
        productExample.createCriteria().andIdBetween((offset), (offset + limit+1));
        return productMapper.selectByExample(productExample);
    }

}
