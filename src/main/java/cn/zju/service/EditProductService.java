package cn.zju.service;

import cn.zju.utils.pagination.Pagination;
import org.springframework.stereotype.Service;

@Service
public interface EditProductService {

    public Integer updateProduct(Long id, String name, String packageList, String sizes, Float weight);

    public Integer deleteProduct(Long id);

    public Integer addProduct(String name,Integer packageList,Integer sizes,Integer weight);

    public Pagination SelectProductList(String name, Boolean isDel, Integer pageNow);


}
