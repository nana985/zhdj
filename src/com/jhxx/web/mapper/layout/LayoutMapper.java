package com.jhxx.web.mapper.layout;

import java.util.List;
import java.util.Map;

import com.jhxx.web.model.layout.Querycolumn;

public interface LayoutMapper {
	//加载表格头字段信息
		List<Querycolumn> getTableHeader(Map<String, Object> params); 
}	
