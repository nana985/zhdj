package com.jhxx.web.mapper.login;

import com.jhxx.web.model.user.User;

public interface LoginDao {

	//登录
	public User findByUserNum(String unum);
}
