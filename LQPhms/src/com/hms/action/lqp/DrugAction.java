package com.hms.action.lqp;

import java.util.Map;

import javax.annotation.Resource;

import com.hms.entity.Drug;
import com.hms.entity.Message;
import com.hms.entity.Pager;
import com.hms.service.lqp.drugServiceDao;
import com.hms.util.BaseAction;

import net.sf.json.JSONObject;

public class DrugAction extends BaseAction {
    @Resource(name="drugServiceDaoImp") 
	private  drugServiceDao drugSD;
      private Drug drug;
      private Pager pager;
      
	public Drug getDrug() {
		return drug;
	}
	public void setDrug(Drug drug) {
		this.drug = drug;
	}
	public drugServiceDao getDrugSD() {
		return drugSD;
	}
	public void setDrugSD(drugServiceDao drugSD) {
		this.drugSD = drugSD;
	}
	
      
	public Pager getPager() {
		return pager;
	}
	public void setPager(Pager pager){
		this.pager = pager;
	}
	public void find(){
		pager.setPageSize(3);
		Pager p= drugSD.findByPages(pager);
	  	String str=	JSONObject.fromObject(p).toString();
		this.getPrintWriter().print(str);
	}
	public void findById(){	
		 int id=drug.getDrugId();
		 Map map=drugSD.findById(id);
		 this.getPrintWriter().print(JSONObject.fromObject(map));
	}
	
/*public void saveOrUpdate(){
		drugSD.saveOrUpdate(drug);
		Message mess=new Message(drug.getDrugId(),"操作成功");
		this.getPrintWriter().print(JSONObject.fromObject(mess));
	}*/
	public void saveOrUpdate(){
		System.out.println("000000");
		drugSD.saveOrUpdate(drug);
		/*(drug.getDrugId(),"")*/
		Message mess = new Message(drug.getDrugId(), "操作成功");
				this.getPrintWriter().print(JSONObject.fromObject(mess));
	System.out.println("111111");
	}
}
