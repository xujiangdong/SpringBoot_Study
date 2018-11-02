package com.example.springboot_uploadfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.MultipartConfigElement;

@SpringBootApplication
public class SpringbootUploadfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootUploadfileApplication.class, args);
	}

}
