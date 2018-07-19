package com.example.fanat.retrom2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class VeriListem {

    @SerializedName("page")
    @Expose
    public Integer page;
    @SerializedName("per_page")
    @Expose
    public Integer perPage;
    @SerializedName("total")
    @Expose
    public Integer total;
    @SerializedName("total_pages")
    @Expose
    public Integer totalPages;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;

    public List<Datum> getEmployee() {
        return data;
    }


}