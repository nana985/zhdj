package com.jhxx.web.serviceImpl.login;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.jhxx.web.mapper.login.LoginDao;
import com.jhxx.web.model.user.User;
import com.jhxx.web.service.login.LoginService;
import com.jhxx.web.utils.ProjectResult;

@Service
public class LoginServiceImpl implements LoginService{

	@Resource
	private LoginDao loginDao;

	public LoginDao getLoginDao() {
		return loginDao;
	}
	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	@Override
	public ProjectResult login(String unum, String psd) {
		ProjectResult result = new ProjectResult();
		User user = loginDao.findByUserNum(unum);
		
		//检测用户是否存在
		if(user == null){
			//状态:1表示成功，2表示失败
			result.setStatus(2);
			result.setMsg("用户名不存在");
			//不需要返回数据，则不写
			result.setData(null);
			return result;
		}
		//密码错误时
		if(!user.getPsd().equals(psd)){
			result.setStatus(2);
			result.setMsg("密码错误");
			return result;
		}
		//全部正确
		result.setStatus(1);
		result.setMsg("用户名和密码正确");
		result.setData(user);
		
		return result;
	}
}
