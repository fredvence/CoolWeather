package com.example.chenzuoxiao.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by chenzuoxiao on 2017/12/3.
 * 使用OkHttp与服务器交互只需要调用sendOkHttpRequest()方法，传入请求地址，并注册个回调来处理服务器响应就可以了
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        okHttpClient.newCall(request).enqueue(callback);
    }
}
