package com.example.demo.repository

import com.example.demo.bean.ShareResponse
import com.example.demo.bean.StationListInfo
import com.example.demo.network.RetrofitClient

class ChargingStationRepository{
    suspend fun getStationList(
        latitude: Double=31.2304,
        longitude: Double=121.4737,
        rad: String="50",
        sort: String="DISTANCE",
        page: Int=1,
        pageSize: Int=10,
        isFast: Int?=null,
        isSlow: Int?=null,
        isSuper: Int?=null,
    ): ShareResponse<StationListInfo>{
        val  queryMap=hashMapOf(
            "station_lat" to latitude.toString(),
            "station_lng" to longitude.toString(),
            "rad" to rad,
            "sort" to sort,
            "page" to page.toString(),
            "page_size" to pageSize.toString()
        )
        isFast?.let { queryMap["is_fast"]=it.toString() }
        isSlow?.let { queryMap["is_slow"]=it.toString() }
        isSuper?.let { queryMap["is_super"]=it.toString() }
        return RetrofitClient.chargingApi.getStationList(queryMap)
    }
}