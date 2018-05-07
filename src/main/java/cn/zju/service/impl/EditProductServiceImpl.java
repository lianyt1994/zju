package cn.zju.service.impl;

import cn.zju.bean.ProductProduct;
import cn.zju.dto.ProductQueryDto;
import cn.zju.mapper.ProductProductMapper;
import cn.zju.service.EditProductService;
import cn.zju.utils.pagination.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditProductServiceImpl implements EditProductService{

    @Autowired
    private ProductProductMapper productProductMapper;


    public Integer updateProduct(Long id, String name, String packageList, String sizes, Float weight){
        ProductProduct productProduct = new ProductProduct();
        productProduct.setId(id);
        productProduct.setName(name);
        productProduct.setPackageList(packageList);
        productProduct.setSizes(sizes);
        productProduct.setWeight(weight);
        productProduct.setIsDel(true);
        int res = productProductMapper.updateByPrimaryKeySelective(productProduct);
        return res;
    }



    public Pagination SelectProductList(String search, Boolean isDel, Integer pageNow){
        ProductQueryDto productQueryDto = new ProductQueryDto();
        StringBuilder stringBuilder = new StringBuilder();
        if (null != search){
            productQueryDto.setName(search);
            stringBuilder.append("search="+ search);
        }
        /*if (null != isDel ){
            productQueryDto.setIsDel(isDel);
            stringBuilder.append("&isDel="+isDel);
        }else {
            productQueryDto.setIsDel(true);
            stringBuilder.append("&isDel = true");
        }*/
        productQueryDto.setPageNow(Pagination.cpn(pageNow));

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
        pagination.pageView("/editGoods/editGoods", stringBuilder.toString());
        return pagination;
    };

    public Integer deleteProduct(Long id){
        int result = productProductMapper.deleteByPrimaryKey(id);
        return result;
    }

    public Integer addProduct(String name, Integer packageList, Integer sizes, Integer weight){
        return null;
    }



}
