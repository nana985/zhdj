package com.jhxx.web.controller.dsj;

import java.util.Map;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.jhxx.web.service.dsj.DsjService;
import com.jhxx.web.utils.ResponseResult;

@Controller
@RequestMapping(value= {"/dsj","/api/dsj"})  
public class DsjController {
	@Resource
	private DsjService ds;
	//获取大屏展示名称
	@RequestMapping(value="/dsj.do",method=RequestMethod.POST)
	@ResponseBody
	public ResponseResult<String> selectScreenname(){
		ResponseResult<String> rr = new ResponseResult<String>();
		rr.setState(1);
		rr.setData(ds.selectScreenname());
		return rr;
	}
	//设置大屏展示名称
	@RequestMapping(value="/updateScreen.do",method=RequestMethod.POST)
	@ResponseBody
	public ResponseResult<Void> updateScreen(@RequestBody Map<String,String> map){
		ResponseResult<Void> rr = new ResponseResult<Void>();
		
		
		
			ds.updateScreenname(map.get("name"));
			rr.setState(1);
			rr.setMessage("设置成功");
		
		
		return rr;
	}
}
