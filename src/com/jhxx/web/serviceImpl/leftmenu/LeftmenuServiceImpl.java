package com.jhxx.web.serviceImpl.leftmenu;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import com.jhxx.web.mapper.leftmenu.LeftmenuDao;
import com.jhxx.web.model.leftmenu.Leftmenu;
import com.jhxx.web.service.leftmenu.LeftmenuService;
@Service
public class LeftmenuServiceImpl implements LeftmenuService{
	@Resource
	private LeftmenuDao lmd;
	
	@Override
	public List<Leftmenu> selectLeftmenu(String unum) {
		List<Leftmenu> list = lmd.selectLeftmenu(unum);
		for(Leftmenu leftMenu : list) {
			List<Leftmenu> li = lmd.selectLeftmenuByboptid(unum,leftMenu.getBoptid());
			leftMenu.setSmloptList(li);
		}
		return list; 
	}

	
	
}
