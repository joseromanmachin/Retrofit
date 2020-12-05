package com.example.tutorialretrofit.dataAcces;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstace {

    private static Retrofit retrofit= null;
    private static String BASE_URL = "http://192.168.0.233:81/";

    public static Api getApiService (){
        if (retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(Api.class);
    }
}
