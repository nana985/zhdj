package com.jhxx.web.serviceImpl.layout;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.jhxx.web.mapper.layout.LayoutMapper;
import com.jhxx.web.model.layout.Querycolumn;
import com.jhxx.web.service.layout.LayoutService;

@Service
public class LayoutServiceImpl implements LayoutService{
	
	Logger log=Logger.getLogger(LayoutServiceImpl.class);
	@Resource
	LayoutMapper layoutMapper;
	//动态获取表字段
	@Override
	public List<Querycolumn> getTableHeader(Map<String, Object> params) {
		
		return layoutMapper.getTableHeader(params);
	}

}
