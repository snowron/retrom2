package com.example.fanat.retrom2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.example.fanat.retrom2.api.APIService;
import com.example.fanat.retrom2.api.APIUrl;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private List<Datum> dat;


    public void gam() {
        Gson gson = new GsonBuilder().setLenient().create();


        Retrofit retrofit = new Retrofit.Builder().baseUrl(APIUrl.BASE_URL).addConverterFactory(GsonConverterFactory.create(gson)).build();

        APIService apis = retrofit.create(APIService.class);
        Call<VeriListem> call = apis.verilerilistele(2);
        call.enqueue(new Callback<VeriListem>() {
            @Override
            public void onResponse(Call<VeriListem> call, Response<VeriListem> response) {
                dat = response.body().getEmployee();
                Log.d("snow", response.raw().request().url().toString());
                Log.d("snow", dat.get(0).firstName.toString());
                Log.d("snow", response.body().totalPages.toString());
            }

            @Override
            public void onFailure(Call<VeriListem> call, Throwable t) {
                Log.d("snow", t.getMessage().toString());
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gam();

    }
}
