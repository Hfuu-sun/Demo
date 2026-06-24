package com.example.demo.repository

import com.example.demo.bean.ShareResponse
import com.example.demo.bean.StationListInfo
import com.example.demo.network.RetrofitClient

class ChargingStationRepository{
    suspend fun getStationList(): ShareResponse<StationListInfo>{
        val  queryMap=hashMapOf(
            "page" to "1",
            "page_size" to "10"
        )
        return RetrofitClient.chargingApi.getStationList(queryMap)
    }
}