package com.hms.dao.lqp;

import java.util.Map;

import com.hms.entity.Detail;
import com.hms.entity.Drug;
import com.hms.entity.Pager;

public interface DetailDao {
	//��ѯ��ϸ
	public Pager findAll(Pager pager,String params);
	//ҩ�����
	public void saveByDetail(Detail detail);
	//ҩƷ�ֵ���ѯ
	public Map findBydrug(Drug drug,Object... params);
	//����ID��ѯ
	public Map findById(int id);
	//�޸���ϸ
	public void updateByDetail(Detail detail);
}
