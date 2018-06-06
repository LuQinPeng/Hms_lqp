package com.hms.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.hms.entity.Unloading;
import com.hms.service.drugstorageServiceDao;
import com.opensymphony.xwork2.ActionSupport;

public class drugstorageAction extends ActionSupport {
    @Autowired     
	private drugstorageServiceDao druSd;

	public drugstorageServiceDao getDruSd() {
		return druSd;
	}

	public void setDruSd(drugstorageServiceDao druSd) {
		this.druSd = druSd;
	}
	  public String select(){
		  System.out.println(1111);
		Map list=druSd.query();
		System.out.println(2222);
		ServletActionContext.getRequest().setAttribute("list", list);
		System.out.println(list);
		return "success";  
	  }	
}
