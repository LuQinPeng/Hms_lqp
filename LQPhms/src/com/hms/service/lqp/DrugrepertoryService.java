package com.hms.service.lqp;

import java.util.List;

import com.hms.entity.Detail;
import com.hms.entity.Drug;
import com.hms.entity.Drugstoragerep;
import com.hms.entity.Unloading;

public interface DrugrepertoryService {
	public List findrepertory(String min,String max);
	public void save(Detail dateil,Drugstoragerep drugst,Unloading unld);
	public void update(Drugstoragerep drugst);
	public void updateByunld(Unloading unld);
	public void saveDrug(Drugstoragerep drugst,Drug drug);
}
