package com.jhxx.web.serviceImpl.dsj;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.jhxx.web.mapper.dsj.DsjDao;
import com.jhxx.web.service.dsj.DsjService;
@Service
public class DsjServiceImpl implements DsjService{
	@Resource
	private DsjDao dd;
	
	@Override
	public String selectScreenname() {
		
		return dd.selectScreenname();
	}

	@Override
	public void updateScreenname(String name) {
		dd.updateScreenname(name);
	}

}
