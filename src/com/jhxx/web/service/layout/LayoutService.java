package com.jhxx.web.service.layout;

import java.util.List;
import java.util.Map;

import com.jhxx.web.model.layout.Querycolumn;

public interface LayoutService {
	//获取表头
		public List<Querycolumn> getTableHeader(Map<String, Object> params) ;
}
