package com.htht.controller;

import com.htht.util.FileUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @author 李正元
 * @create 2018-08-30 0:08
 * @desc 文件上传
 **/
@RequestMapping("file")
@Controller
public class FileUploadController {

    @Value("${image.path}")
    private String imagePath;

    @RequestMapping("toUpload")
    public String toUpload(){
        return "/fileupload";
    }

    @RequestMapping(value = "productFileUpload", method = RequestMethod.POST)
    public @ResponseBody
    Object fileUpload(@RequestParam("file") MultipartFile file,
                      HttpServletRequest request){
        String originalFilename = file.getOriginalFilename();
        String fileName = UUID.randomUUID()+"."+originalFilename.split("\\.")[1];
        Date date = new Date();
        String path = imagePath+new SimpleDateFormat("yyyy/MM/dd/").format(date);
        String realPath = path+fileName;
        try {
            FileUtil.uploadFile(file.getBytes(), path, fileName);
        } catch (Exception e) {
            // TODO: handle exception
        }
        //返回json
        return realPath;
    }


}
