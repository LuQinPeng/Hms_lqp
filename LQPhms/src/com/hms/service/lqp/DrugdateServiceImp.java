package com.hms.service.lqp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hms.dao.lqp.DrugDateDao;
import com.hms.entity.Drug;
import com.hms.entity.Pager;
@Service("drugdateServiceImp")
public class DrugdateServiceImp implements DrugdateService {
	@Resource(name="drugDateDaoImp")
	private DrugDateDao dao;
	

	public DrugDateDao getDao() {
		return dao;
	}


	public void setDao(DrugDateDao dao) {
		this.dao = dao;
	}


	@Override
	public List<Drug> Select(String min, String max) {
		return dao.Select(min, max);
	}


	@Override
	public Pager findByPages(Pager pager) {
		// TODO Auto-generated method stub
		return dao.findByPages(pager);
	}

}
