package cn.zju.web;

import cn.zju.bean.ProductProduct;
import cn.zju.service.BuyGoodsService;
import cn.zju.service.EditProductService;
import cn.zju.service.ProductService;
import cn.zju.service.UpdatePicService;
import cn.zju.utils.ConstantValue;
import cn.zju.utils.pagination.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping(value = "/")
public class EditGoodsController {

    /*@Autowired
    private ConstantValue constantValue;*/

    //static final String PREPATH = System.getProperty("user.dir")+"/src/main/webapp/images";
    static final String PREPATH = "C:/Users/Administrator/Desktop/zju/src/main/webapp/images";
    //static final String PREPATH = "../../../webapp/images";
    //final String PREPATH = System.getProperty("user.dir")+"/src/main/webapp/images" ;


    public static Jedis jedis = new Jedis("120.78.177.60");

    @Autowired
    private BuyGoodsService buyGoodsService;

    @Autowired
    private UpdatePicService updatePicService;

    @Autowired
    private ProductService productService;

    @Autowired
    private EditProductService editProductService;

    @RequestMapping(value = "/editGoods/editGoods")
    public String goToBuyGoods(String search, Boolean isDel, Integer pageNo, Model model){
        if (pageNo == null)pageNo=1;
        Pagination pagination = null;
        if(search != null)pagination = editProductService.SelectProductList(search, true, pageNo);
        else pagination = editProductService.SelectProductList(null, true, pageNo);
        model.addAttribute("pagination", pagination);
        model.addAttribute("search", search);
        model.addAttribute("isDel", isDel);
        return "/editGoods/editGoods";
    }

    @RequestMapping(value = "/editGoods/confirmEditGoods")
    public String editGoods(Long id, String name, String packageList, String sizes, Float weight,Model model){
        Integer result = editProductService.updateProduct(id, name, packageList, sizes, weight);
        Pagination pagination = null;
        pagination = editProductService.SelectProductList(null, true, 1);
        model.addAttribute("pagination", pagination);
        model.addAttribute("result", result);
        return "redirect:/editGoods/editGoods";
    }

    @RequestMapping(value = "/editGoods/deleteGoods")
    public String editGoods(Long id,Model model){
        Integer result = editProductService.deleteProduct(id);
        Pagination pagination = null;
        pagination = editProductService.SelectProductList(null, true, 1);
        model.addAttribute("pagination", pagination);
        model.addAttribute("result", result);
        return "/editGoods/editGoods";
    }

    @RequestMapping(value = "/editGoods/uploadPic")
    public void uploadPic(HttpServletRequest request,
                          HttpServletResponse response,
                          @RequestParam(value="id") String id, @RequestParam(value="pic")MultipartFile pic){
        //String PREPATH = System.getProperty("user.dir")+"/src/main/webapp/images";
        File file = new File(PREPATH, "image"+id+".jpg");
        try {
            pic.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            request.getRequestDispatcher("/editGoods/editGoods").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("editGoods/fileUpload")
    public String fileUpload(HttpServletRequest request,
                             @RequestParam("file") MultipartFile file,
                             @RequestParam(value="id") String id
                                    ,Model model,Integer pageNo) {
        // 判断文件是否为空
        if (!file.isEmpty()) {
            try {
                // 文件保存路径
                String filePath = request.getSession().getServletContext().getRealPath("/") + "upload/"
                        + file.getOriginalFilename();
                // 转存文件
                file.transferTo(new File("C:/Users/Administrator/Desktop/seckill2/src/main/webapp/images", "image"+id+".jpg"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Pagination pagination = null;
        pagination = editProductService.SelectProductList(null, true, pageNo);
        model.addAttribute("pagination", pagination);
        return "forward:/editGoods/editGoods";
    }

    @RequestMapping(value = "/editGoods/addGoods")
    public String goToAddGoods(Model model) {
        String id = jedis.get("id");
        if (id == null){
            jedis.set("id","600" );
            id = jedis.get("id");
        }
        jedis.set("id", String.valueOf(Long.parseLong(id)+1));
        jedis.expire("id",60*60*24*365*2);
        model.addAttribute("id",id );
        return "/editGoods/addGoods";
    }

    @RequestMapping(value = "/editGoods/addGoodsSubmit")
    public String goToAddGoodsSubmit(@RequestParam(required = false) MultipartFile file, Long id,String name, String packageList) {
        //String PREPATH = System.getProperty("user.dir")+"/src/main/webapp/images";
        ProductProduct productProduct = new ProductProduct();
        System.out.println(PREPATH);
        productProduct.setId(id);
        productProduct.setName(name);
        productProduct.setPackageList(packageList);
        if (productService.selectProductById(id)==null ) {
            productService.insertProduct(id, name, packageList);
        }else{
            productService.updateProductByPrimarykeySelective(productProduct);
        }
        if (null != file) {
            try {
                file.transferTo(new File(PREPATH, "image"+id+".jpg"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "redirect:/editGoods/editGoods";
    }
}
