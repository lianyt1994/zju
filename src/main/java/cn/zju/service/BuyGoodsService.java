package cn.zju.service;

import cn.zju.bean.ProductProduct;

import java.util.List;

public interface BuyGoodsService {

    public List<ProductProduct> QueryAllProducts();

    public List<ProductProduct> QueryAllProductsLimit(Long offset,Long limit);
}
