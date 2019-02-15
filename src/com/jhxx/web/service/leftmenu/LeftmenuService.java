package com.jhxx.web.service.leftmenu;

import java.util.List;

import com.jhxx.web.model.leftmenu.Leftmenu;

public interface LeftmenuService {
	//获取一级菜单信息
	public List<Leftmenu> selectLeftmenu(String unum);
	
}
