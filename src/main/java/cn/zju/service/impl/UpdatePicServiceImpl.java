package cn.zju.service.impl;

import cn.zju.service.UpdatePicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class UpdatePicServiceImpl implements UpdatePicService {

    /*@Autowired
    private ProductImaMapper productImaMapper;*/

    @Override
    public void updatePic(Long id, MultipartFile multipartFile) {
        /*byte[] bytes = new byte[1024*1024*4];
        try {
            bytes =  multipartFile.getBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }
        productImaMapper.uploadPic(id, bytes);*/
    }
}
