package com.iqiqiya.lanlanweather.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {

    private int id;
    private String provinceName;
    private int ProvinceCode;

    private int getId(){
        return id;
    }
    private void setId(){
        this.id = id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }
    public int getProvinceCode(){
        return ProvinceCode;
    }
    public void setProvinceCode(){
        this.ProvinceCode = ProvinceCode;
    }

}
