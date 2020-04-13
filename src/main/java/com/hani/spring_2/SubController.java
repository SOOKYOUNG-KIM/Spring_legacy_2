package com.hani.spring_2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping(value = "/sub/**")		//**는 하위폴더 포함이라는 뜻
public class SubController {
	
	@RequestMapping(value = "sub1")
	public void sub1() {
		
	}
	
	@RequestMapping(value = "sub2")
	public String sub2() {
		return "sub/sub2";
	}
	
}

