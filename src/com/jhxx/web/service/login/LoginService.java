package com.jhxx.web.service.login;

import com.jhxx.web.utils.ProjectResult;

public interface LoginService {
	//登录
	public ProjectResult login(String unum,String psd);
}
