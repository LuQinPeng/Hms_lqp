package com.hms.dao.lqp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.hms.entity.Detail;
import com.hms.entity.Drug;
import com.hms.entity.Pager;
import com.hms.util.PagerHelper;
@Repository("detailDaoImp")
public class DetailDaoImp implements DetailDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	@Override
	public Pager findAll(Pager pager, String params){
		// TODO Auto-generated method stub
		String strWhere=" where drugName  like '%"+params+"%'";//查询条件
		String hql="select new Map(detail.detId as detId, detail.drug.drugName as drugName,DATE_FORMAT(detail.unloading.unldate,'%Y-%m-%d') as unldate,detail.detnumb as detnumb) from Detail as detail ";
		String hql1="select count(*) from Detail " ;
		String hql2="select count(*),detail.drug.drugName as drugName from Detail as detail" ;
		System.out.println(params);
		if(params!=null&&!params.equals("")){//如果参数不为空，绑定查询条件
			hql+=strWhere;
			hql2+=strWhere;
		}
		Pager p=this.hibernateTemplate.execute(new PagerHelper(hql, hql1, null,  pager.getCurPage(), pager.getPageSize()));
		return p;
	}


	@Override
	public void saveByDetail(Detail detail) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(detail);
	}


	@Override
	public Map findBydrug(Drug drug, Object... params) {
		// TODO Auto-generated method stub
		String hql="select new Map(drug.drugName as drugName,drug.drugSpell as drugSpell,drug.drugSpec as drugSpec,drug.drugPrice as drugPrice)from Drug as drug where drug.drugName like '%"+drug.getDrugName()+"%'";		
		Map map = new HashMap();
		List<Drug> list = hibernateTemplate.find(hql);
		map.put("findBydrug",list );
		return map;
	}


	@Override
	public Map findById(int id) {
		// TODO Auto-generated method stub
		String hql="select new Map(detail.detId as detId,detail.drug.drugName as drugName,DATE_FORMAT(detail.unloading.unldate,'%Y-%m-%d') as unldate,detail.detnumb as detnumb) from Detail as detail where detail.detId=? ";
		return (Map) this.hibernateTemplate.find(hql,id).get(0);
	}
	@Override
	public void updateByDetail(Detail detail) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.update(detail);
	}

}
