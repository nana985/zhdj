package com.jhxx.web.controller.leftmenu;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jhxx.web.model.leftmenu.Leftmenu;
import com.jhxx.web.service.leftmenu.LeftmenuService;
import com.jhxx.web.utils.ResponseResult;

@Controller
@RequestMapping(value= {"/left","/api/left"})  
public class LeftmenuController {
	@Resource
	private LeftmenuService lms;
	
	@RequestMapping(value="/Leftmenu.do",method=RequestMethod.POST)
	//获取导航菜单
	@ResponseBody
	public  ResponseResult<List<Leftmenu>> getLeftMenu(@RequestBody Map<String,String> map) throws IOException{
		List<Leftmenu> list = lms.selectLeftmenu(map.get("unum"));
		ResponseResult<List<Leftmenu>> rr = new ResponseResult<List<Leftmenu>>();
		rr.setState(1);
		rr.setData(list);
		return rr;
	}
}
