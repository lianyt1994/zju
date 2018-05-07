package cn.zju.service;

import cn.zju.bean.ProductProduct;
import cn.zju.dto.ProductQueryDto;
import cn.zju.utils.pagination.Pagination;
import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public interface ProductService {

    public Pagination SelectProductList(String name,Boolean isDel,Integer pageNo);

    public void uploadPic(Long id, MultipartFile multipartFile);

    public void insertProduct(Long id, String name, String packageList);

    public ProductProduct selectProductById(Long id);

    public void updateProductByPrimarykeySelective(ProductProduct productProduct);
}
