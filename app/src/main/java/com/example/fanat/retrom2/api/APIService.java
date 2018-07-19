package com.example.fanat.retrom2.api;

import com.example.fanat.retrom2.VeriListem;
import com.example.fanat.retrom2.data;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;


public interface APIService {

    @FormUrlEncoded
    @POST("users")
    Call<data> at(@Field("name") String name,
                  @Field("job") String job);




    @GET("api/users")
    Call<VeriListem> verilerilistele(@Query("page") int deger);
}


