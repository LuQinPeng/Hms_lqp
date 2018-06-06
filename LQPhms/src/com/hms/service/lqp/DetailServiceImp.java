package com.hms.service.lqp;

import java.util.Map;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hms.dao.lqp.DetailDaoImp;
import com.hms.entity.Detail;
import com.hms.entity.Drug;
import com.hms.entity.Pager;
@Service("detailServiceImp")
public class DetailServiceImp implements DetailService {
@Resource(name="detailDaoImp")
   private DetailDaoImp dao;

	public DetailDaoImp getDao() {
	return dao;
}

public void setDao(DetailDaoImp dao) {
	this.dao = dao;
}

	@Override
	public Pager findAll(Pager pager, String params) {
		// TODO Auto-generated method stub
		return dao.findAll(pager, params);
	}

	@Override
	@Transactional
	public void saveByDetail(Detail detail) {
		// TODO Auto-generated method stub
		dao.saveByDetail(detail);
	}

	@Override
	public Map findBydrug(Drug drug, Object... params) {
		// TODO Auto-generated method stub
		return dao.findBydrug(drug, params);
	}

	@Override
	public Map findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public void updateByDetail(Detail detail) {
		// TODO Auto-generated method stub
		dao.updateByDetail(detail);
	}

}
