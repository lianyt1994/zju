package cn.zju.service;

import org.springframework.web.multipart.MultipartFile;

public interface UpdatePicService {
    void updatePic(Long id, MultipartFile multipartFile);
}
