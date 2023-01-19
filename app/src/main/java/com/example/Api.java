package com.example;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface Api {
    String BASE_URL = "http://10.0.2.2/playground/api/";
    @GET("users")

    Call<List<Results>> getUsers(@Header("Key") String Key);

    @POST("user/post")

    Call<ResultsPost> postUser(@Header("Email") String email,
                  @Header("Name") String name,
                  @Header("PhoneNumber") String phone,
                  @Header("Password") String password,
                  @Header("DtBorn") String dtBorn,
                  @Header("Document") String document);
}