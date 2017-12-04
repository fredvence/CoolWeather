package com.example.chenzuoxiao.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chenzuoxiao on 2017/12/4.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;//城市名

    @SerializedName("id")
    public String weatherId;//天气id

    @SerializedName("update")
    public Update update;//天气更新时间

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
