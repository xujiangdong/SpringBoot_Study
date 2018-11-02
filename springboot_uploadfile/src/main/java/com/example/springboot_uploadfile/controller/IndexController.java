package com.example.springboot_uploadfile.controller;

import ch.qos.logback.core.util.FileUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;

/**
 * @author XuJD
 * @create 2018-11-01 18:02
 **/
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("/upload")
    public String upload(@RequestParam("file")MultipartFile file, HttpServletRequest request){
        String fileName = file.getOriginalFilename();
        try {
            //文件上传到目标地址
            String filePath = "G:\\demo\\fileUpload\\";
            File targetFile = new File(filePath);
            if(!targetFile.exists()){
                targetFile.mkdirs();
            }
            FileOutputStream out = new FileOutputStream(filePath+fileName);
            out.write(file.getBytes());
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "上传成功";
    }
}
