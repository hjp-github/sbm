package com.hjp.sbm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hjp.sbm.service.user.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
    private IUserService userService;

	@RequestMapping("/test")
	public String test() {
		
		userService.test();
		
		return "hello word";
	}

}
