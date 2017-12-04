package com.example.chenzuoxiao.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by chenzuoxiao on 2017/12/4.
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggession suggession;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
