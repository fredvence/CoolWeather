package com.example.chenzuoxiao.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by chenzuoxiao on 2017/12/3.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;//县名
    private int cityId;//当前县的所属市
    private int weatherId;//对应的天气id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }
}
