package cn.zju.service.impl;

import cn.zju.bean.ProductProduct;
import cn.zju.bean.ProductProductExample;
import cn.zju.dto.ProductQueryDto;
import cn.zju.mapper.ProductProductMapper;
import cn.zju.service.ProductService;
import cn.zju.utils.pagination.Pagination;
import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductProductMapper productProductMapper;

    public Pagination SelectProductList(String search, Boolean isDel, Integer pageNow) {
        ProductQueryDto productQueryDto = new ProductQueryDto();
        StringBuilder stringBuilder = new StringBuilder();
        if (null != search) {
            productQueryDto.setName(search);
            stringBuilder.append("search=" + search);
        }
        productQueryDto.setPageNow(Pagination.cpn(pageNow));
        /*if (null != isDel ){
            productQueryDto.setIsDel(isDel);
            stringBuilder.append("&isDel="+isDel);
        }else {
            productQueryDto.setIsDel(true);
            stringBuilder.append("&isDel = true");
        }*/
        List<ProductProduct> productProducts = productProductMapper.selectProductLimit(productQueryDto);
        if (productProducts != null && productProducts.size() != 0) {
            for (ProductProduct productProduct : productProducts) {
                if (productProduct.getImgUrl() != null) {
                    productProduct.setImages(productProduct.getImgUrl().split(","));
                }
            }
        }
        Pagination pagination = new Pagination(
                productQueryDto.getPageNow(),
                productQueryDto.getPageSize(),
                productProductMapper.SelectProductCount(productQueryDto));
        pagination.setList(productProducts);
        pagination.pageView("/buyGoods/buyGoods", stringBuilder.toString());
        return pagination;
    }

    @Override
    public void uploadPic(Long id, MultipartFile multipartFile) {
        ProductProductExample productProductExample = new ProductProductExample();
        productProductExample.createCriteria().andIdEqualTo(id);
        ProductProduct productProduct = new ProductProduct();
        try {
            productProduct.setImgUrl(String.valueOf(multipartFile.getBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        productProductMapper.updateByExampleSelective(productProduct, productProductExample);
    }

    @Override
    public void insertProduct(Long id, String name, String packageList) {
        ProductProduct productProduct = new ProductProduct();
        productProduct.setId(id);
        productProduct.setName(name);
        productProduct.setPackageList(packageList);
        productProductMapper.insert(productProduct);
    }

    @Override
    public ProductProduct selectProductById(Long id) {

        ProductProduct productProduct = productProductMapper.selectByPrimaryKey(id);
        return productProduct;
    }

    @Override
    public void updateProductByPrimarykeySelective(ProductProduct productProduct) {
            productProductMapper.updateByPrimaryKeySelective(productProduct);
    }
}
