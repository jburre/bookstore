package com.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping(value={"","/","/index"})
	public String index(){
		return "index";
	}
	
	@RequestMapping(value={"/myAccount"})
	public String myAccount(){
		return "myAccount";
	}
}
