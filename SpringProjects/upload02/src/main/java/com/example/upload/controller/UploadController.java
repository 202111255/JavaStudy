package com.example.upload.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class UploadController {
    @RequestMapping("/upload_form")
    public String upload_form() {
        return "upload_form";
    }

    @RequestMapping("/upload_ok")
    public String upload_ok(MultipartFile upload,
                            String userid,
                            String userpw) {
        if (!upload.isEmpty()) {
            try {
                String filename = upload.getOriginalFilename().substring(0, upload.getOriginalFilename().lastIndexOf("."));
                String extension = upload.getOriginalFilename().substring(upload.getOriginalFilename().lastIndexOf("."));
                upload.transferTo(new File("d:/java/upload", filename+"_"+System.nanoTime() + extension));
            } catch (IOException e) {
                System.out.println("[에러] " + e.getMessage());
            }
        } else {
            System.out.println("업로드 파일 없음");
        }


        return "upload_ok";
    }

    @RequestMapping("/download")
    public String download() {
        return "list";
    }


}
