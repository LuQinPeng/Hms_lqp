package com.hms.dao.lqp;

import java.util.Map;

import com.hms.entity.Detail;
import com.hms.entity.Drug;
import com.hms.entity.Drugstoragerep;
import com.hms.entity.Pager;
import com.hms.entity.Unloading;


public interface PharmacyDao {
   public Map findByDrugstoragerep();
   public Map findBypharmacy();
   public Map findBydrug(Drug drug,Object... params);
   public Pager findByunld(Pager pager,String min,String max);
   public void saveBypharmacy(Unloading unld);
   public void saveBydrug(Detail detail);
   public void updateByharmacy(Unloading unld);
   public void updateBydrugst(Drugstoragerep drugst);
   public Pager findByuniding(Pager pager);
   public boolean isExists(String unlname);
}
