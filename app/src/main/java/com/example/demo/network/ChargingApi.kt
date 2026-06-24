package com.example.demo.network

import com.example.demo.bean.ShareResponse
import com.example.demo.bean.StationListInfo
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface ChargingApi{
    @GET("/v1/station/list")
    suspend fun getStationList(
        @QueryMap queryMap: HashMap<String, String>
    ): ShareResponse<StationListInfo>
}