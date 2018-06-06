package com.hms.dao.lqp;

import java.util.List;

import com.hms.entity.Detail;
import com.hms.entity.Drug;
import com.hms.entity.Drugstoragerep;
import com.hms.entity.Unloading;


public interface DrugrepertoryDao {
	public List findrepertory(String min,String max);
	public List findbyunld(Unloading unld);
	public List findbydrugst(Drugstoragerep drugst);
	public void save(Detail dateil,Drugstoragerep drugst,Unloading unld);
	public void saveDrug(Drugstoragerep drugst,Drug drug);
	public void update(Drugstoragerep drugst);
	public void updateByunld(Unloading unld);
    public List findsAll();
}
