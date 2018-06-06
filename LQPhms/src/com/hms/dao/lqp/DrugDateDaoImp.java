package com.hms.dao.lqp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.hms.entity.Drug;
import com.hms.entity.Pager;
import com.hms.util.PagerHelper;

@Repository("drugDateDaoImp")
public class DrugDateDaoImp implements DrugDateDao {
	@Autowired
    private HibernateTemplate hibernateTemplate;
	   	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	@Override
	public List<Drug> Select(String min, String max) {
	  String hql = "select  drug.drugName as drugName,drugst.dsrSumNumber as dsrSumNumber,unloading.unlname as unlname from Drug as drug,Drugstoragerep as drugst,Unloading as unloading  where drugst.dsrId = drug.drugstoragerep.dsrId  and unloading.drugstoragerep.dsrId= drugst.dsrId   and unloading.unldate  BETWEEN '"+min+"' and '"+max+"' ORDER BY drugst.dsrId";	 
	  return hibernateTemplate.find(hql);
	}
	@Override
	public Pager findByPages(Pager pager) {
		// TODO Auto-generated method stub
		  String hql="select new Map(unlname as unlname,unlNumber as unlNumber,unlstate as unlstate,DATE_FORMAT(unldate,'%Y %m %d') as unldate)from Unloading";
	        String hql1="select count(*) from Unloading";
	        Pager p=this.hibernateTemplate.execute(new PagerHelper(hql, hql1, null, pager.getCurPage(),pager.getPageSize()));
	        return p;
	}
	@Override
	public boolean isExists(String unlname) {
		// TODO Auto-generated method stub
		String hql="select count(*) from Unloading where unlname= ?";
		int count=Integer.parseInt(this.hibernateTemplate.find(hql,unlname).get(0).toString());
		return count>0?true:false;
	}

}
