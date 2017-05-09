package com.carllewis14.goustoextraproducts.Network;

import android.content.Context;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Retrofit Client used to parse API
 */

public class RetroClient {

    private Context mContext;
    private static OkHttpClient httpClient;

    /********
     * URL of API
     *******/
    private static final String ROOT_URL = "https://api.gousto.co.uk";



    /**
     * Get Retrofit Instance
     */
    private static Retrofit getRetrofitInstance() {
        return new Retrofit.Builder()
                .baseUrl(ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }

    /**
     * Get API Service
     */
    public static ApiInterface getApiService(){
        return getRetrofitInstance().create(ApiInterface.class);
    }






}
