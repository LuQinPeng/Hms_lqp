package com.hms.dao.lqp;

import java.util.Map;

import com.hms.entity.Detail;
import com.hms.entity.Drug;
import com.hms.entity.Pager;

public interface DetailDao {
	//查询明细
	public Pager findAll(Pager pager,String params);
	//药房添加
	public void saveByDetail(Detail detail);
	//药品字典表查询
	public Map findBydrug(Drug drug,Object... params);
	//根据ID查询
	public Map findById(int id);
	//修改明细
	public void updateByDetail(Detail detail);
}
