package com.cos.blog.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogControllerTest {

	@RequestMapping("/test/hello")
	public String hello() {
		return "쿠키런";
	}
	
	
}
