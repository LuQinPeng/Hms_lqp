package com.hms.service.lqp;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hms.dao.lqp.DrugDao;
import com.hms.entity.Drug;
import com.hms.entity.Pager;

@Service("drugServiceDaoImp")
public class drugServiceDaoImp implements drugServiceDao {
 @Resource(name="drugDaoImp")
    private DrugDao dao;
	@Override
	public Map findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

/*	@Transactional
	public void saveOrUpdate(Drug drug) {
		// TODO Auto-generated method stub
		if(drug.getDrugId()!=null&&drug.getDrugId()>0){
			dao.update(drug);
		}else{
			dao.save(drug);
		}
	}*/
	@Override
	public Pager findByPages(Pager pager) {
		// TODO Auto-generated method stub
		return dao.findByPages(pager);
	}

	@Transactional
	public void saveOrUpdate(Drug drug) {
		// TODO Auto-generated method stub
	  if(drug.getDrugId()!=null&&drug.getDrugId()>0){
		  dao.update(drug);
		 
	  }else {
		dao.save(drug);
	}
	  System.out.println("ÅĞ¶ÏÁ¦");
	}


}
