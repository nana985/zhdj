package com.jhxx.web.mapper.dsj;

public interface DsjDao {
	//获取大屏展示的名称
	String selectScreenname();
	//设置大屏展示的名称
	void updateScreenname(String name);
}
