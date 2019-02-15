package com.jhxx.web.mapper.leftmenu;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jhxx.web.model.leftmenu.Leftmenu;

public interface LeftmenuDao {
	//获取一级菜单信息
	public List<Leftmenu> selectLeftmenu(String unum);
	//通过一级菜单id获取二级菜单信息
	public List<Leftmenu> selectLeftmenuByboptid(@Param("unum") String unum,@Param("boptid") Integer boptid);
}
