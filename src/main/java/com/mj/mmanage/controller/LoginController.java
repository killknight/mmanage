package com.mj.mmanage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mj.mmanage.model.UserInfo;
import com.mj.mmanage.service.UserInfoService;

/**
 * 用户登录
 * @author guobaoli
 *
 */
@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private UserInfoService userInfoService;
	
	@RequestMapping
	public ModelAndView login(String username,String password){
		UserInfo userInfo = userInfoService.getUserInfo(username, password);
		ModelAndView result = null;
		if(null == userInfo){
			result = new ModelAndView("login");
			result.addObject("errorMsg", "用户名或密码错误，请重新登录");
		}else{
			result = new ModelAndView("index");
			result.addObject("userInfo", userInfo);
		}
		return result;
	}
	
	@RequestMapping(value = "/toLogin")
	public ModelAndView toLogin(){
		ModelAndView result = new ModelAndView("login");
		return result;
	}
}
