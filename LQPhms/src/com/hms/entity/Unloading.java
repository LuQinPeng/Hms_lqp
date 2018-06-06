package com.hms.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Unloading entity. @author MyEclipse Persistence Tools
 */

public class Unloading  implements java.io.Serializable {


    // Fields    

     private Integer unlId;
     private Drugstoragerep drugstoragerep;
     private Date unldate;
     private String unlstate;
     private Integer unlNumber;
     private String unlname;
     private Set details = new HashSet(0);


    // Constructors

    /** default constructor */
    public Unloading() {
    }

    
    /** full constructor */
    public Unloading(Drugstoragerep drugstoragerep, Date unldate, String unlstate, Integer unlNumber, String unlname, Set details) {
        this.drugstoragerep = drugstoragerep;
        this.unldate = unldate;
        this.unlstate = unlstate;
        this.unlNumber = unlNumber;
        this.unlname = unlname;
        this.details = details;
    }

   
    // Property accessors

    public Integer getUnlId() {
        return this.unlId;
    }
    
    public void setUnlId(Integer unlId) {
        this.unlId = unlId;
    }

    public Drugstoragerep getDrugstoragerep() {
        return this.drugstoragerep;
    }
    
    public void setDrugstoragerep(Drugstoragerep drugstoragerep) {
        this.drugstoragerep = drugstoragerep;
    }

    public Date getUnldate() {
        return this.unldate;
    }
    
    public void setUnldate(Date unldate) {
        this.unldate = unldate;
    }

    public String getUnlstate() {
        return this.unlstate;
    }
    
    public void setUnlstate(String unlstate) {
        this.unlstate = unlstate;
    }

    public Integer getUnlNumber() {
        return this.unlNumber;
    }
    
    public void setUnlNumber(Integer unlNumber) {
        this.unlNumber = unlNumber;
    }

    public String getUnlname() {
        return this.unlname;
    }
    
    public void setUnlname(String unlname) {
        this.unlname = unlname;
    }

    public Set getDetails() {
        return this.details;
    }
    
    public void setDetails(Set details) {
        this.details = details;
    }
   








}