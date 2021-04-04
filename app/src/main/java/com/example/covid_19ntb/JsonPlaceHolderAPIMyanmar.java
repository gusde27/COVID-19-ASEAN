package com.example.covid_19ntb;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderAPIMyanmar {

//    https://api.covid19api.com/countries
    @GET("myanmar")
    Call<List<Data>> getData();
}
