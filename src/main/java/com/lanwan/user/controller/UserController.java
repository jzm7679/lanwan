package com.lanwan.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lanwan.common.controller.BaseController;
import com.lanwan.user.model.User;
import com.lanwan.user.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController extends BaseController{
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/list", method = {RequestMethod.POST, RequestMethod.GET})
	public Object list(HttpServletRequest request){
		// test
		User user = new User();
		user.setUsername("lanwan");
		userService.addUser(user);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("username", "lanwan");
		mav.setViewName("/user/list");
		return mav;
	}

}
