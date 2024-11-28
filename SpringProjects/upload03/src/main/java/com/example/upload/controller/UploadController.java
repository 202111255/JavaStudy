package com.example.upload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class UploadController {

    @RequestMapping("/upload")
    public String uploadFrom() {
        return "upload";
    }

    @RequestMapping("/upload_ok")
    public String uploadOk(
        MultipartFile image,
        Model model
    ) {
        String imagename = image.getOriginalFilename();
        if ( !image.isEmpty() ) {
            try {
                String name = imagename.substring( 0, imagename.lastIndexOf( "." ) );
                String ext = imagename.substring( imagename.lastIndexOf( "." ) );

                imagename = name + "_" + System.nanoTime() + ext;
                image.transferTo( new File("", imagename ) );
            } catch (IOException e) {
                System.out.println( "[에러] " + e.getMessage() );
            }
        } else {
            System.out.println( "업로드 파일 없음" );
        }

        model.addAttribute("imagename", imagename );

        return "upload_ok";
    }
}
