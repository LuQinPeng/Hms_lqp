package com.hms.action.lqp;

import javax.annotation.Resource;

import com.hms.entity.Drug;
import com.hms.entity.Pager;
import com.hms.entity.Unloading;
import com.hms.service.lqp.DrugdateService;
import com.hms.util.BaseAction;

import net.sf.json.JSONObject;

public class DrugdateFY extends BaseAction {
	 @Resource(name="drugdateServiceImp")
		private DrugdateService ddd;
	private Drug drug;
	private Unloading unld;
	
     public Unloading getUnld() {
		return unld;
	}
	public void setUnld(Unloading unld) {
		this.unld = unld;
	}
	private Pager pager;
	public DrugdateService getDdd() {
		return ddd;
	}
	public void setDdd(DrugdateService ddd) {
		this.ddd = ddd;
	}
	public Drug getDrug() {
		return drug;
	}
	public void setDrug(Drug drug) {
		this.drug = drug;
	}
	public Pager getPager() {
		return pager;
	}
	public void setPager(Pager pager) {
		this.pager = pager;
	}
	public void findFY1(){
		pager.setPageSize(3);
		Pager p= ddd.findByPages(pager);
	  	String str=	JSONObject.fromObject(p).toString();
		this.getPrintWriter().print(str);
	} 
}
