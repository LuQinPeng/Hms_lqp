package com.hms.service.lqp;

import java.util.List;

import com.hms.entity.Drug;
import com.hms.entity.Pager;



public interface DrugdateService {
	public List<Drug> Select(String min,String max); 
	public Pager findByPages(Pager pager);
}
