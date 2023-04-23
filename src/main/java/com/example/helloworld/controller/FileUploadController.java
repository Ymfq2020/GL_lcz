package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@RestController
public class FileUploadController {

    @PostMapping("/upload")
    public String upload(String nickname, MultipartFile f, HttpServletRequest request) throws IOException {
        System.out.println(nickname);
        // 获取图片的原始名称
        System.out.println(f.getOriginalFilename());
        // 取文件类型
        System.out.println(f.getContentType());
        // System.out.println(System.getProperty("user.dir"));

        String path = request.getServletContext().getRealPath("/upload/");
        // 获取web服务器的运行目录
        System.out.println(path);
        saveFile(f, path);
        return "上传成功";
    }
    public void saveFile(MultipartFile f, String path) throws IOException {
        File dir = new File(path);
        if(!dir.exists()) {
            dir.mkdir();
        }
        File file = new File(path+f.getOriginalFilename());
        f.transferTo(file);
    }
}
