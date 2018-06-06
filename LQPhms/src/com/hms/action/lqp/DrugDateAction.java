package com.hms.action.lqp;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import com.hms.entity.Drug;
import com.hms.entity.Unloading;
import com.hms.service.lqp.DrugdateService;
import com.opensymphony.xwork2.ActionSupport;

public class DrugDateAction extends ActionSupport {
    @Resource(name="drugdateServiceImp")
	private DrugdateService ddd;
     private Unloading unlod;
     private Drug drug;
     private String max;
     private String min;
    
     Map map = (Map) ServletActionContext.getContext().get("request");
     
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
	public DrugdateService getDdd() {
		return ddd;
	}
	public void setDdd(DrugdateService ddd) {
		this.ddd = ddd;
	}
	public Unloading getUnlod() {
		return unlod;
	}
	public void setUnlod(Unloading unlod) {
		this.unlod = unlod;
	}
	public String select(){
		 List<Drug> list=ddd.Select(min, max);		 
		 map.put("a", list);
		return SUCCESS;
	}
}
