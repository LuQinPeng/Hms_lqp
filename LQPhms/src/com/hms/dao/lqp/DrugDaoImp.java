package com.hms.dao.lqp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hms.entity.Drug;
import com.hms.entity.Pager;
import com.hms.util.PagerHelper;

@Repository("drugDaoImp")
public class DrugDaoImp implements DrugDao {
	@Autowired
       private HibernateTemplate hibernateTemplate;
	
	 	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	public Map findById(int id) {
		String hql="select new Map(drugId as drugId ,drugName as drugName,drugSpell as drugSpell,drugSpec as drugSpec,drugPrice as drugPrice,state as state,DATE_FORMAT(drugdate,'%Y %m %d') as drugdate)from Drug where drugId=? ";
		return (Map) this.hibernateTemplate.find(hql,id).get(0);		
	}


	public void delete(Drug drug) {
		// TODO Auto-generated method stub
    this.hibernateTemplate.delete(drug);
	}


	public void update(Drug drug) {
		// TODO Auto-generated method stub
this.hibernateTemplate.update(drug);
	}

@Transactional
	public void save(Drug drug) {
		// TODO Auto-generated method stub
this.hibernateTemplate.save(drug);
	}


	public boolean isExists(String drugName) {
		// TODO Auto-generated method stub
		String hql="select count(*) from Drug where drugName= ?";
		int count=Integer.parseInt(this.hibernateTemplate.find(hql,drugName).get(0).toString());
		return count>0?true:false;
	}

	public Pager findByPages(Pager pager) {

        String hql="select new Map(drugId as drugId ,drugName as drugName,drugSpell as drugSpell,drugSpec as drugSpec,drugPrice as drugPrice,state as state,DATE_FORMAT(drugdate,'%Y %m %d') as drugdate)from Drug";
        String hql1="select count(*) from Drug";
        Pager p=this.hibernateTemplate.execute(new PagerHelper(hql, hql1, null, pager.getCurPage(),pager.getPageSize()));
        return p;
	}
}
