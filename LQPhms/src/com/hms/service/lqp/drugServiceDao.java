package com.hms.service.lqp;

import java.util.Map;

import com.hms.entity.Drug;
import com.hms.entity.Pager;

public interface drugServiceDao {
	public Map findById(int id);
	
	public void saveOrUpdate(Drug drug);
	public Pager findByPages(Pager pager);
	
}
