package com.example.chenzuoxiao.coolweather.util;

import android.text.TextUtils;

import com.example.chenzuoxiao.coolweather.db.City;
import com.example.chenzuoxiao.coolweather.db.County;
import com.example.chenzuoxiao.coolweather.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by chenzuoxiao on 2017/12/3.
 */

public class Utility {

    /**
     * 解析处理服务器返回的省级数据
     */
    public static boolean handleProvinceResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            JSONArray Provinces = null;
            try {
                Provinces = new JSONArray(response);
                int length = Provinces.length();
                for (int i = 0; i < length; i++) {
                    JSONObject provinceObject = Provinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
        return false;
    }

    /**
     * 解析处理服务器返回的市级数据
     */
    public static boolean handleCityResponse(String response, int provinceId){
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray Cities = new JSONArray(response);
                int length = Cities.length();
                for (int i = 0; i < length; i++) {
                    JSONObject cityObject = Cities.getJSONObject(i);
                    City city = new City();
                    city.setCityCode(cityObject.getInt("id"));
                    city.setCityName(cityObject.getString("name"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    /**
     * 解析处理服务器返回的县级数据
     */
    public static boolean handleCountyResponse(String response, int cityId){
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray counties = new JSONArray(response);
                int length = counties.length();
                for (int i = 0; i < length; i++) {
                    JSONObject countyObject = counties.getJSONObject(i);
                    County county = new County();
                    county.setCityId(countyObject.getInt("id"));
                    county.setCountyName(countyObject.getString("name"));
                    county.setCityId(cityId);
                    county.save();
                }
                return  true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
