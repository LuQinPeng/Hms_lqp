package com.hms.dao.lqp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.hms.entity.Detail;
import com.hms.entity.Drug;
import com.hms.entity.Drugstoragerep;
import com.hms.entity.Pager;
import com.hms.entity.Unloading;
import com.hms.util.PagerHelper;

@Repository("pharmacyDaoImp")
public class PharmacyDaoImp implements PharmacyDao {
   @Autowired
      private HibernateTemplate hibernateTemplate;
   
	public HibernateTemplate getHibernateTemplate() {
	return hibernateTemplate;
}

public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	this.hibernateTemplate = hibernateTemplate;
}

	@Override
	public Map findBypharmacy() {
		// TODO Auto-generated method stub
		String hql="from Unloading";
		return (Map) hibernateTemplate.find(hql);
	}

	@Override
	public void saveBypharmacy(Unloading unld) {
		// TODO Auto-generated method stub
    this.hibernateTemplate.save(unld);
	}

	@Override
	public void updateByharmacy(Unloading unld) {
		// TODO Auto-generated method stub
     this.hibernateTemplate.update(unld);
	}
	
	@Override
	public Map findBydrug(Drug drug,Object... params) {
		// TODO Auto-generated method stub		
		String hql="select new Map(drug.drugName as drugName,drug.drugSpell as drugSpell,drug.drugSpec as drugSpec,drug.drugPrice as drugPrice)from Drug as drug where drug.drugName like '%"+drug.getDrugName()+"%'";		
		Map map = new HashMap();
		List<Drug> list = hibernateTemplate.find(hql);
		map.put("findBydrug",list );
		return map;
	}
	@Override
	public Map findByDrugstoragerep() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Pager findByuniding(Pager pager) {
		// TODO Auto-generated method stub
		String hql="select new Map( drug.drugName as drugName,drug.drugUnit as drugUnit,drug.drugSpec as drugSpec,drug.drugDosage as drugDosage,drug.drugPrice as drugPrice,drugst.dsrSumNumber as dsrSumNumber,drugst.dsrId as dsrId,unloading.unlname as unlname,unloading.unlstate as unlstate,DATE_FORMAT(unloading.unldate,'%Y %m %d') as unldate,unloading.unlNumber as unlNumber) from Drug as drug,Drugstoragerep as drugst,Unloading as unloading  where drugst.dsrId = drug.drugstoragerep.dsrId and unloading.drugstoragerep.dsrId= drugst.dsrId  ORDER BY drugst.dsrId";
		String hql1="select count(*) from Unloading";
		Pager p=this.hibernateTemplate.execute(new PagerHelper(hql, hql1, null,  pager.getCurPage(), pager.getPageSize()));
		return p;
	}
	@Override
	public boolean isExists(String unlname) {
		// TODO Auto-generated method stub
		String hql="select count(*) from Unloading where unlname= ?";
		int count=Integer.parseInt(this.hibernateTemplate.find(hql,unlname).get(0).toString());
		return count>0?true:false;
	}
	@Override
	public void updateBydrugst(Drugstoragerep drugst) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.update(drugst);
	}

	@Override
	public Pager findByunld(Pager pager, String min,String max) {
		// TODO Auto-generated method stub
		String strWhere=" where unld.unldate  BETWEEN '"+min+"' and '"+max+"' ";//查询条件
		String hql="select new Map( DATE_FORMAT(unld.unldate,'%Y %m %d') as unldate,unld.unlname as unlname,unld.unlstate as unlstate,unld.drugstoragerep.dsrId as dsrId,unld.drugstoragerep.dsrSumNumber as dsrSumNumber,unld.unlId as unlId) from Unloading as unld";
		String hql1="select count(*) from Unloading " ;
		if(min!=null&max!=null&&!min.equals("")|!max.equals("")){//如果参数不为空，绑定查询条件
			hql+=strWhere;
			hql1+=strWhere;
		}
		System.out.println(min);
		Pager p=this.hibernateTemplate.execute(new PagerHelper(hql, hql1,null, pager.getCurPage(), pager.getPageSize()));
		return p;
	}

	@Override
	public void saveBydrug(Detail detail) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(detail);
	}

}
