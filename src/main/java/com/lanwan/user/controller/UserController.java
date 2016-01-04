package com.lanwan.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lanwan.common.controller.BaseController;

@Controller
@RequestMapping(value = "/user")
public class UserController extends BaseController{
	
	@RequestMapping(value = "/list", method = {RequestMethod.POST, RequestMethod.GET})
	public Object list(HttpServletRequest request){
		ModelAndView mav = new ModelAndView();
		mav.addObject("username", "lanwan");
		mav.setViewName("/user/list");
		return mav;
	}
	
	@RequestMapping(value = "/add", method = {RequestMethod.POST, RequestMethod.GET})
	public Object add(HttpServletRequest request){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/user/add");
		return mav;
	}
	

}
