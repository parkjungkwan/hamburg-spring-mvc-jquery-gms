package com.example.demo.itm.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import lombok.RequiredArgsConstructor;

@RestController
public class FileController {
	@PostMapping("/fileupload/image")
	public Map<String, Object> fileUpload(MultipartHttpServletRequest request){
	    System.out.println("$$$$$$$$$$$$$$$$$$$");
		MultipartFile mfile = request.getFile("file");
	    if(!mfile.isEmpty()) {
	    	System.out.println("업로드된 파일명: "+ mfile.getOriginalFilename());
	    	File file = new File("", mfile.getOriginalFilename());
	    	try {
				mfile.transferTo(file);
			} catch (Exception e) {
				e.printStackTrace();
			} 
	    }
	    
	    return null;
	}	    
	

}
