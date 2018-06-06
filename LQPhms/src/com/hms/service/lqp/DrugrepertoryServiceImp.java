package com.hms.service.lqp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hms.dao.lqp.DrugrepertoryDao;
import com.hms.entity.Detail;
import com.hms.entity.Drug;
import com.hms.entity.Drugstoragerep;
import com.hms.entity.Unloading;

@Service("drugrepertoryServiceImp")
public class DrugrepertoryServiceImp implements DrugrepertoryService {
    
	@Resource(name="drugrepertoryDaoImp")
	private DrugrepertoryDao dao;
	
	
	public DrugrepertoryDao getDao() {
		return dao;
	}


	public void setDao(DrugrepertoryDao dao) {
		this.dao = dao;
	}


	@Override
	public List findrepertory(String min,String max) {
		return dao.findrepertory(min, max);
		// TODO Auto-generated method stub
	}


	@Transactional
	public void save(Detail dateil, Drugstoragerep drugst, Unloading unld) {
		// TODO Auto-generated method stub
		dao.save(dateil, drugst, unld);
	}


	@Transactional
	public void update( Drugstoragerep drugst) {
		// TODO Auto-generated method stub
		dao.update( drugst);
	}


	@Override
	public void saveDrug( Drugstoragerep drugst, Drug drug) {
		// TODO Auto-generated method stub
		dao.saveDrug( drugst,drug);
	}
	@Override
	public void updateByunld(Unloading unld) {
		// TODO Auto-generated method stub
		dao.updateByunld(unld);
	}



}
