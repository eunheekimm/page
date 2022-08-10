package com.eunhee.page;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlService {

	@Autowired
	UrlDao urlDao;
	
	public Map<String,String> getPageUrls(){
		return urlDao.selectUrls();
	}

}
