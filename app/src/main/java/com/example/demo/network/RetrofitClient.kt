package com.example.demo.network


import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitClient{   //全局单例
    private const val BASE_URL = "https://union-charge-test.aijidou.com/"
    
    private val okHttpClient= OkHttpClient.Builder()
        .retryOnConnectionFailure(true)
        .addInterceptor (
            HttpLoggingInterceptor().apply { 
                level= HttpLoggingInterceptor.Level.BODY
            }
        )
        .connectTimeout(30, java.util.concurrent.TimeUnit.SECONDS)
        .readTimeout(30, java.util.concurrent.TimeUnit.SECONDS)
        .writeTimeout(30, java.util.concurrent.TimeUnit.SECONDS)
        .build()
    
    val chargingApi: ChargingApi by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ChargingApi::class.java)
    }
}