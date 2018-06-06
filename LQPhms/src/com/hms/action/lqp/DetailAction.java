package com.hms.action.lqp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.hms.entity.Detail;
import com.hms.entity.Drug;
import com.hms.entity.Pager;
import com.hms.service.lqp.DetailService;
import com.hms.util.BaseAction;

import net.sf.json.JSONObject;

public class DetailAction extends BaseAction {
	@Resource(name="detailServiceImp")
   private DetailService  dse;
   private Pager pager;
   private List<Detail> details;
   private Detail detail;
   private Drug drug;
   
   public DetailService getDse() {
	return dse;
}

public void setDse(DetailService dse) {
	this.dse = dse;
}
Map map = new HashMap();
public Drug getDrug() {
	return drug;
}

public void setDrug(Drug drug) {
	this.drug = drug;
}



public List<Detail> getDetails() {
	return details;
}

public void setDetails(List<Detail> details) {
	this.details = details;
}

public Detail getDetail() {
	return detail;
}

public void setDetail(Detail detail) {
	this.detail = detail;
}

public Pager getPager() {
	return pager;
}

public void setPager(Pager pager) {
	this.pager = pager;
}

   public void findAll(){
	   pager.setPageSize(5);
	   if(detail!=null){//����в���
			String p1=detail.getDrug().getDrugName();//�趨����
			pager=dse.findAll(pager, p1);
		}else{//û�в���ʱ
			pager=dse.findAll(pager,null);
		}
		this.getPrintWriter().print(JSONObject.fromObject(pager));//ת��json�����
	}
   public void finddrug1(){
		String name=drug.getDrugName();
		map=dse.findBydrug(drug, name);	
		System.out.println("����find");
		this.getPrintWriter().print(JSONObject.fromObject(map));
	}
   public String savedetail(){
	  /* ����*/
	   for(int i=0;i<details.size();i++){
		dse.saveByDetail(details.get(i));
	   }
		System.out.println("�������");
		return "success";
	}
	public void findById(){
	int id=detail.getDetId();	
	System.out.println("����getDetId"+id);
	Map map= dse.findById(id);
	this.getPrintWriter().print(JSONObject.fromObject(map));
}

public void updateByDetail(){
	dse.updateByDetail(detail);
	System.out.println("����updateByDetail");
	this.getPrintWriter().print(JSONObject.fromObject(detail));
}
   }

