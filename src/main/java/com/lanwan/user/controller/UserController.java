package com.lanwan.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	@RequestMapping(value = "/list", method = {RequestMethod.POST, RequestMethod.GET})
	public Object list(HttpServletRequest request){
		ModelAndView mav = new ModelAndView();
		mav.addObject("username", "lanwan");
		mav.setViewName("user/list");
		return mav;
	}

}
