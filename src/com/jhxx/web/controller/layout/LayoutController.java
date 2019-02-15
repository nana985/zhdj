package com.jhxx.web.controller.layout;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jhxx.web.model.layout.Querycolumn;
import com.jhxx.web.service.layout.LayoutService;

@Controller
@RequestMapping(value= {"/layout","/api/layout/*"})
public class LayoutController {
	
Logger log=Logger.getLogger(LayoutController.class);
	
	@Autowired 
	LayoutService layoutService;
	/**
	 * 
	 * 获取表头
	 * @return json
	 * */
	@RequestMapping(value="getTableHeader.do",method=RequestMethod.POST) 
	public @ResponseBody List<Querycolumn> getTableHeader(@RequestBody Map<String, Object> params){
		System.out.println("获取动态表头："+params);
		System.out.println("获取到的表字段:"+layoutService.getTableHeader(params));
		return layoutService.getTableHeader(params);
		
	}
	
}
