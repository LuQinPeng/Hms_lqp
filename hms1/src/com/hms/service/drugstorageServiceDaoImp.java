package com.hms.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.dao.drugstorageDao;
@Service
public class drugstorageServiceDaoImp implements drugstorageServiceDao {
    @Autowired  
	private drugstorageDao dao;
      
	public drugstorageDao getDao() {
		return dao;
	}

	public void setDao(drugstorageDao dao) {
		this.dao = dao;
	}

	@Override
	public Map query() {
		// TODO Auto-generated method stub
		return dao.query();
	}

}
