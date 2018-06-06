package com.hms.dao.lqp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hms.entity.Detail;
import com.hms.entity.Drug;
import com.hms.entity.Drugstoragerep;
import com.hms.entity.Unloading;

@Repository("drugrepertoryDaoImp")
public class DrugrepertoryDaoImp implements DrugrepertoryDao {
      @Autowired
	private HibernateTemplate hibernateTemplate;
      
      		 
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	@Override
	public List findrepertory(String min,String max){
		// TODO Auto-generated method stub
/*		String hql="select new Map( drug.drugName as drugName,drugstoragerep.dsrSumNumber as dsrSumNumber,unloading.unlname as unlname,DATE_FORMAT(drug.drugdate,'%Y %m %d') as drugdate,dareil.detnumb as detnumb) from Drug as drug,Detail as dareil,Drugstoragerep as drugstoragerep,Unloading as unloading where drugstoragerep.dsrId = drug.drugId and drugstoragerep.dsrId = unloading.unlId and drugdate BETWEEN'"+min+"' and '"+max+"'";		
*/	
		String hql="select new Map( DATE_FORMAT(unld.unldate,'%Y %m %d') as unldate,unld.unlname as unlname,unld.unlstate as unlstate,unld.drugstoragerep.dsrId as dsrId,unld.unlId as unlId) from Unloading as unld  where unld.unldate  BETWEEN '"+min+"' and '"+max+"' ";
		return this.hibernateTemplate.find(hql);
	}
	@Transactional
	public void save(Detail dateil, Drugstoragerep drugst, Unloading unld) {
		dateil.setUnloading(unld);
		unld.setDrugstoragerep(drugst);
		this.hibernateTemplate.save(dateil);
	}


	@Transactional
	public void update(Drugstoragerep drugst) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.update(drugst);
	}


	@Override
	public List findsAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void saveDrug(Drugstoragerep drugst, Drug drug) {
		// TODO Auto-generated method stub

		drug.setDrugstoragerep(drugst);
		this.hibernateTemplate.save(drug);
	}


	@Override
	public void updateByunld(Unloading unld) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.update(unld);
	}


	@Override
	public List findbyunld(Unloading unld) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List findbydrugst(Drugstoragerep drugst) {
		// TODO Auto-generated method stub
		return null;
	}

}
