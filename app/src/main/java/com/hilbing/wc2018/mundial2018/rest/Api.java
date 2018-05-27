package com.hilbing.wc2018.mundial2018.rest;

import com.hilbing.wc2018.mundial2018.model.WorldCup2018;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface Api {

    String BASE_URL = "https://raw.githubusercontent.com/lsv/fifa-worldcup-2018/master/";

    @Headers("Content-Type: application/json")
    @GET("data.json")
    Call<WorldCup2018> getData();


}
