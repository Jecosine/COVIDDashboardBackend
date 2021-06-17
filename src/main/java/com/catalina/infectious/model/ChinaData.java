package com.catalina.infectious.model;
import java.sql.Date;

import java.sql.Date;

public class ChinaData {

  private Integer sNo;
  private Date observationDate;
  private String provinceState;
  private String countryRegion;
  private Integer confirmed;
  private Integer deaths;
  private Integer recovered;

  public ChinaData() {
  }

  public ChinaData(Integer sNo, Date observationDate, String provinceState, String countryRegion, Integer confirmed, Integer deaths, Integer recovered) {
    this.sNo = sNo;
    this.observationDate = observationDate;
    this.provinceState = provinceState;
    this.countryRegion = countryRegion;
    this.confirmed = confirmed;
    this.deaths = deaths;
    this.recovered = recovered;
  }

  public Integer getSNo() {
    return sNo;
  }

  public void setSNo(Integer sNo) {
    this.sNo = sNo;
  }


  public java.sql.Date getObservationDate() {
    return observationDate;
  }

  public void setObservationDate(java.sql.Date observationDate) {
    this.observationDate = observationDate;
  }


  public String getProvinceState() {
    return provinceState;
  }

  public void setProvinceState(String provinceState) {
    this.provinceState = provinceState;
  }


  public String getCountryRegion() {
    return countryRegion;
  }

  public void setCountryRegion(String countryRegion) {
    this.countryRegion = countryRegion;
  }


  public Integer getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(Integer confirmed) {
    this.confirmed = confirmed;
  }


  public Integer getDeaths() {
    return deaths;
  }

  public void setDeaths(Integer deaths) {
    this.deaths = deaths;
  }


  public Integer getRecovered() {
    return recovered;
  }

  public void setRecovered(Integer recovered) {
    this.recovered = recovered;
  }

}
