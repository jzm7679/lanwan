package com.lanwan.index.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lanwan.common.controller.BaseController;

@Controller
public class IndexController extends BaseController{
	
	@RequestMapping(value = "/index", method = {RequestMethod.POST, RequestMethod.GET})
	public Object index(HttpServletRequest request){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/index/index");
		return mav;
	}

}
