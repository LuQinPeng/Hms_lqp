package com.hms.dao.lqp;

import java.util.List;

import com.hms.entity.Drug;
import com.hms.entity.Pager;



public interface DrugDateDao {
	public List<Drug> Select(String min,String max); 	
    public Pager findByPages(Pager pager);
    public boolean isExists(String unlname);
}
