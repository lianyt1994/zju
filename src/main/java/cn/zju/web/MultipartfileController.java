package cn.zju.web;

import cn.zju.bean.ProductProduct;
import cn.zju.service.ProductService;
import cn.zju.utils.ConstantValue;
import cn.zju.utils.JedisUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import redis.clients.jedis.Jedis;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping(value = "/")
public class MultipartfileController {

    /*@Autowired
    private ConstantValue constantValue;*/

    //static String PIC_PATH = new File("./").getAbsolutePath()+"src/main/webapp/images" + "/t/";
    //static final String PIC_PATH = Thread.currentThread().getContextClassLoader().getResource("").toString()+"../../src/main/webapp/images" + "/t/";
    static final String PIC_PATH = "C:/Users/Administrator/Desktop/zju/src/main/webapp/images" + "/t/";
    //String PIC_PATH = System.getProperty("user.dir")+"/src/main/webapp/images" + "/t/";

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/editGoods/editPic")
    public String goToMultipartfile(Long productId, Model model) {
        ProductProduct product = productService.selectProductById(productId);
        String[] images = null;
        if (product.getImgUrl() != null) {
            images = product.getImgUrl().split(",");
        }
        product.setImages(images);
        model.addAttribute("product", product);
        return "/editGoods/editPic";
    }

    @RequestMapping(value = "/editGoods/uploadPics")
    public String uploadPics(Long productId, @RequestParam(required = false) MultipartFile[] files, HttpServletResponse response) {
        //String PIC_PATH = System.getProperty("user.dir")+"/src/main/webapp/images" + "/t/";
        String[] paths = new String[files.length];
        int i = 0;
        Jedis jedis = JedisUtils.getJedis();
        String jedisResult = jedis.get("pic" + productId);
        if (jedisResult == null) {
            jedis.set("pic" + productId, "0");
            jedisResult = "0";
        }
        int picNumber = Integer.parseInt(jedisResult);

        String strPath = PIC_PATH + "t" + productId;
        File filePath = new File(strPath);
        if (!filePath.exists()) {
            filePath.mkdirs();
        }

        for (MultipartFile file : files) {
            String path = PIC_PATH + "t" + productId;
            String fileName = "e" + picNumber + ".jpg";
            picNumber += 1;
            try {
                file.transferTo(new File(path, fileName));
            } catch (IOException e) {
                e.printStackTrace();
            }
            paths[i++] = "/images/t/t" + productId + "/" + fileName;
        }
        jedis.set("pic" + productId, String.valueOf(picNumber));


        ProductProduct product = new ProductProduct();
        product.setId(productId);
        product.setImgUrl(String.join(",", paths));

        if (productService.selectProductById(productId) == null) {
            productService.insertProduct(productId, " ", "0");
        }

        productService.updateProductByPrimarykeySelective(product);

        /*JSONObject jo = new JSONObject();
        jo.put("data", paths);
        response.setContentType("application/json;charset=UTF-8");
        try {
            response.getWriter().write(jo.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        return "redirect:/editGoods/editPic?productId=" + productId;
    }
}
