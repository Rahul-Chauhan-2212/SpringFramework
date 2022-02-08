package com.spring.mvc.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String fileupload(@RequestParam("file") CommonsMultipartFile file, HttpSession session, Model model) {
		System.out.println(file.getOriginalFilename());
		String path = session.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources"
				+ File.separator + "images" + File.separator + file.getOriginalFilename();
		System.out.println(path);
		byte[] data = file.getBytes();
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			model.addAttribute("msg", "File upload successful");
			model.addAttribute("file", file.getOriginalFilename());

		} catch (IOException e) {
			e.printStackTrace();
			model.addAttribute("msg", "File upload Failed");

		}
		return "file_upload_success";
	}

}
