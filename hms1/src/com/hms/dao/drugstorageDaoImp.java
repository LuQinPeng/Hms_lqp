package com.hms.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class drugstorageDaoImp implements drugstorageDao {
	
	@Autowired
   private HibernateTemplate hibernateTemplate;
   
	public HibernateTemplate getHibernateTemplate() {
	return hibernateTemplate;
}

public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	this.hibernateTemplate = hibernateTemplate;
}

	@Override
	public Map query(){
		// TODO Auto-generated method stub
		return (Map) this.hibernateTemplate.find("from Unloading");
	}

}
