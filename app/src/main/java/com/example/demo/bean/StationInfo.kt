package com.example.demo.bean

import com.google.gson.annotations.SerializedName

data class StationInfo(
    @SerializedName("station_name")
    val stationName: String?=null,
    @SerializedName("address")
    val address: String?=null,
    @SerializedName("distance")
    val distance: Double?=null,
    @SerializedName("fast_gun_num")
    val fastGunNum: Int?=null,
    @SerializedName("fast_gun_free_num")
    val fastGunFreeNum: Int=0,
    @SerializedName("low_gun_num")
    val lowGunNum: Int?=null,
    @SerializedName("low_gun_free_num")
    val lowGunFreeNum: Int?=null,
    @SerializedName("curr_total_fee")
    val currTotalFee: String?=null
)