package com.hms.action.lqp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.hms.entity.Detail;
import com.hms.entity.Drug;
import com.hms.entity.Drugstoragerep;
import com.hms.entity.Pager;
import com.hms.entity.Unloading;
import com.hms.service.lqp.PharmacyServiceDao;
import com.hms.util.BaseAction;

import net.sf.json.JSONObject;

public class PharmacyAction extends BaseAction {
   @Resource(name="pharmacyServiceDaoImp")
   private PharmacyServiceDao psd;
   private Drug drug;
   private Pager pager;
   private Unloading unld;
   private Drugstoragerep drugst;
   private String min;
   private String max;
   private List<Detail> detail;
   

public List<Detail> getDetail() {
	return detail;
}

public void setDetail(List<Detail> detail) {
	this.detail = detail;
}

public String getMin() {
	return min;
}

public void setMin(String min) {
	this.min = min;
}

public String getMax() {
	return max;
}

public void setMax(String max) {
	this.max = max;
}
Map map = new HashMap();
   
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

public Pager getPager() {
	return pager;
}

public void setPager(Pager pager) {
	this.pager = pager;
}

public Drug getDrug() {
	return drug;
}

public void setDrug(Drug drug) {
	this.drug = drug;
}

public PharmacyServiceDao getPsd() {
	return psd;
}

public void setPsd(PharmacyServiceDao psd) {
	this.psd = psd;
}

public void finddrug(){
	String name=drug.getDrugName();
	map=psd.findByDrug(drug, name);
	this.getPrintWriter().print(JSONObject.fromObject(map));
}
public void findByunlding(){
	pager.setPageSize(3);
    Pager p =psd.findByuniding(pager);
	String str=	JSONObject.fromObject(p).toString();
	this.getPrintWriter().print(str);
}
public String savepharmary(){
	psd.saveBypharmacy(unld);	
	return "success";
}

public void findunld(){
	pager.setPageSize(3);
	if(unld.getUnldate()!=null){//如果有参数
		pager=psd.findByunld(pager, min, max);
	}else{//没有参数时
		pager=psd.findByunld(pager,null,null);
	}
	String str=	JSONObject.fromObject(pager).toString();
	this.getPrintWriter().print(str);
}
public String saveBydrug(){
	System.out.println("savedrug添加");
	for(Detail te:detail){
		psd.saveBydrug(te);
	  }
	return "success";
}
}
