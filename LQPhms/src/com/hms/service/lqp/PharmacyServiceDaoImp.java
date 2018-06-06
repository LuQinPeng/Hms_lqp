package com.hms.service.lqp;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hms.dao.lqp.PharmacyDao;
import com.hms.entity.Detail;
import com.hms.entity.Drug;
import com.hms.entity.Pager;
import com.hms.entity.Unloading;

@Service("pharmacyServiceDaoImp")
public class PharmacyServiceDaoImp implements PharmacyServiceDao {
@Resource(name="pharmacyDaoImp")
private PharmacyDao dao;

	public PharmacyDao getDao() {
	return dao;
}

public void setDao(PharmacyDao dao) {
	this.dao = dao;
}

	@Override
	public Map findByDrug(Drug drug,Object... params) {
		// TODO Auto-generated method stub
		return dao.findBydrug(drug,params);
	}
	
	@Override
	public Pager findByuniding(Pager pager) {
		// TODO Auto-generated method stub
		return dao.findByuniding(pager);
	}

	@Transactional
	@Override
	public void saveBypharmacy(Unloading unld) {
		// TODO Auto-generated method stub
		dao.saveBypharmacy(unld);
	}

	@Override
	public void updateByharmacy(Unloading unld) {
		// TODO Auto-generated method stub
		dao.updateByharmacy(unld);
	}

	@Override
	public Pager findByunld(Pager pager, String min, String max) {
		// TODO Auto-generated method stub
		return dao.findByunld(pager, min, max);
	}
    @Transactional
	@Override
	public void saveBydrug(Detail detail) {
		// TODO Auto-generated method stub
		dao.saveBydrug(detail);
	}	
}
