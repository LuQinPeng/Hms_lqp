package com.hms.service.lqp;

import java.util.Map;

import com.hms.entity.Detail;
import com.hms.entity.Drug;
import com.hms.entity.Pager;
import com.hms.entity.Unloading;

public interface PharmacyServiceDao {
   public Map findByDrug(Drug drug,Object... params);
   public Pager findByuniding(Pager pager);
   public void saveBypharmacy(Unloading unld);
   public void saveBydrug(Detail detail);
   public void updateByharmacy(Unloading unld);
   public Pager findByunld(Pager pager,String min,String max);
}
