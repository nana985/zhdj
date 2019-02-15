package com.jhxx.web.controller.login;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSONObject;
import com.jhxx.web.model.Suite;
import com.jhxx.web.service.login.LoginService;
import com.jhxx.web.utils.ProjectResult;
/**
 * 登录
 */
@Controller
@RequestMapping(value= {"/login","/api/login"})
public class LoginController {

	@Resource
	private LoginService loginService;
	@Resource
	RestTemplate restTemplate;
	
	public LoginService getLoginService() {
		return loginService;
	}
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	@RequestMapping(value="/login.do",method=RequestMethod.POST)
	@ResponseBody
	public ProjectResult login(@RequestBody Map<String, String> map){
		//调用业务处理组件
		ProjectResult result = loginService.login(map.get("unum"), map.get("psd"));
		return result;
	}
}
