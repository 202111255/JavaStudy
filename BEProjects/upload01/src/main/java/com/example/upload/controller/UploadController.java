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
    @RequestMapping("/form")
    public String form() {
        return "form";
    }

    @RequestMapping("/form_ok")
    public String form_ok(@RequestParam MultipartFile upload) {
        if (!upload.isEmpty()) {
            try {
                System.out.println(upload.getOriginalFilename());

                //같은 이름의 파일이면 덮어쓰기
                //파일이름 정책
                //중복파일 처리를 반드시 해주어야 함
                String filename = upload.getOriginalFilename().substring(0, upload.getOriginalFilename().lastIndexOf("."));
                String extension = upload.getOriginalFilename().substring(upload.getOriginalFilename().lastIndexOf("."));
                upload.transferTo(new File("d:/java/upload", filename+"_"+System.nanoTime() + extension));
            } catch (IOException e) {
                System.out.println("[에러] " + e.getMessage());
            }
        } else {
            System.out.println("업로드 파일 없음");
        }


        return "form_ok";
    }

    @RequestMapping("/form_ok2")
    public String form_ok2(MultipartFile upload,
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


        return "form_ok";
    }
}
