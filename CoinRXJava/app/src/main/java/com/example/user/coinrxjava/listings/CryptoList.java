package com.example.user.coinrxjava.listings;

import com.example.user.coinrxjava.retrofit.info.Status;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
public class CryptoList implements Serializable {
    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    private final static long serialVersionUID = -4369048252305703014L;
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public Collection<? extends Datum> getData() {
        return data;
    }
    public void setData(List<Datum> data) {
        this.data = data;
    }
}