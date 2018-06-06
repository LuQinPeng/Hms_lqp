package com.hms.action.lqp;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import com.hms.entity.Detail;
import com.hms.entity.Drug;
import com.hms.entity.Drugstoragerep;
import com.hms.entity.Unloading;
import com.hms.service.lqp.DrugrepertoryService;
import com.opensymphony.xwork2.ActionSupport;

public class DrugrepertoryAction extends ActionSupport {
       @Resource(name="drugrepertoryServiceImp")
      private DrugrepertoryService drs;
       private  Drug drug;
       private  Drugstoragerep drugst;
       private Detail dateil;
       private  Unloading unld;
       private String max;
       private String min;
   	
       Map map = (Map) ServletActionContext.getContext().get("request");     
	
       public Detail getDateil() {
		return dateil;
	}
	public void setDateil(Detail dateil) {
		this.dateil = dateil;
	}
	public String getMax() {
		return max;
	}
	public void setMax(String max) {
		this.max = max;
	}
	public String getMin() {
		return min;
	}
	public void setMin(String min) {
		this.min = min;
	}
	public Drug getDrug() {
		return drug;
	}
	public void setDrug(Drug drug) {
		this.drug = drug;
	}
	public Drugstoragerep getDrugst() {
		return drugst;
	}
	public void setDrugst(Drugstoragerep drugst) {
		this.drugst = drugst;
	}
	public Unloading getUnld() {
		return unld;
	}
	public void setUnld(Unloading unld) {
		this.unld = unld;
	}
	public DrugrepertoryService getDrs() {
		return drs;
	}
	public void setDrs(DrugrepertoryService drs) {
		this.drs = drs;
	}
       
	public String findDrugrepertory(){		
		 List list=drs.findrepertory(min, max);
		  map.put("datelist", list);
    	  return "success";
	}
	public String saveTo(){
		drs.save(dateil, drugst, unld);
		return "success";

	}
	public String saveDrug(){
		drs.saveDrug( drugst, drug);
		return "success";
		
	}
	public String updateByunld(){
		System.out.println("½øÀ´ÁË");
		drs.updateByunld(unld);
		return SUCCESS;
	}
	public String updateTo(){
		drs.update(drugst);		
		return "success";
	}

}
