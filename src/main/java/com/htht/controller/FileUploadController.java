package com.htht.controller;

import com.htht.util.FileUtil;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 李正元
 * @create 2018-08-30 0:08
 * @desc 文件上传
 **/
@RequestMapping("file")
@RestController
public class FileUploadController {

    @RequestMapping("toUpload")
    public String toUpload(){
        return "fileupload";
    }

    @RequestMapping(value = "fileUpload", method = RequestMethod.POST)
    public @ResponseBody
    Object fileUpload(@RequestParam("file") MultipartFile file,
                      HttpServletRequest request){
        String contentType = file.getContentType();
        String fileName = file.getOriginalFilename();
        /*System.out.println("fileName-->" + fileName);
        System.out.println("getContentType-->" + contentType);*/
        String filePath = request.getSession().getServletContext().getRealPath("imgupload/");
        try {
            FileUtil.uploadFile(file.getBytes(), filePath, fileName);
        } catch (Exception e) {
            // TODO: handle exception
        }
        //返回json
        return "uploadimg success";
    }


}
