package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping("/fileuploadform")
	public String showFileUploadForm() {
		return "file_upload_form";
	}

	@RequestMapping(path = "/fileUpload", method = RequestMethod.POST)
	public String fileupload(@RequestParam("file") CommonsMultipartFile file) {
		System.out.println(file.getOriginalFilename());
		return "file_upload_success";
	}

}
