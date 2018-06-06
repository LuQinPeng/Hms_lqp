package com.hms.service.lqp;

import java.util.Map;

import com.hms.entity.Detail;
import com.hms.entity.Drug;
import com.hms.entity.Pager;

public interface DetailService {
	public Pager findAll(Pager pager,String params);
	public void saveByDetail(Detail detail);
	public Map findBydrug(Drug drug,Object... params);
	public Map findById(int id);

	public void updateByDetail(Detail detail);
}
