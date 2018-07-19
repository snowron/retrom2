package com.example.fanat.retrom2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Belal on 14/04/17.
 */

public class data {
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("job")
    @Expose
    public String job;
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("createdAt")
    @Expose
    public String createdAt;

}