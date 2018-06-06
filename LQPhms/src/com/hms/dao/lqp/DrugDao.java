package com.hms.dao.lqp;

import java.util.Map;

import com.hms.entity.Drug;
import com.hms.entity.Pager;


public interface DrugDao {
	public Map findById(int id);
	
    public void delete(Drug drug);
    
    public void update(Drug drug);
    
    public void save(Drug drug);
    
    public Pager findByPages(Pager pager);
    
    public boolean isExists(String drugName);
}
