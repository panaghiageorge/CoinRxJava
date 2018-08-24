package com.example.user.coinrxjava;

import com.example.user.coinrxjava.listings.CryptoList;
import com.example.user.coinrxjava.retrofit.info.Info;

import io.reactivex.Single;
import retrofit2.http.GET;

import retrofit2.http.Query;
public interface APIInterface {
    //https://pro.coinmarketcap.com/api/v1#section/Quick-Start-Guide
    //@Headers("X-CMC_PRO_API_KEY: 3f921709-ae40-4835-8f1b-ce7a88de1f12")
    @GET("/v1/cryptocurrency/listings/latest?")
    Single<CryptoList> getMarketPairsLatest(@Query("limit") String limit);
    @GET("/v1/cryptocurrency/info")
    Single<Info> getCryptocurrencyInfo(@Query("symbol") String symbol);
}