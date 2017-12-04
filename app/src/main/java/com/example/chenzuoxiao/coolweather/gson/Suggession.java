package com.example.chenzuoxiao.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chenzuoxiao on 2017/12/4.
 */

public class Suggession {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Sport{
        @SerializedName("txt")
        public String info;
    }
    public class Comfort{
        @SerializedName("txt")
        public String info;
    }
    public class CarWash{
        @SerializedName("txt")
        public String info;
    }
}
