package com.example.demo.bean

import com.google.gson.annotations.SerializedName

data  class StationListInfo(
    @SerializedName("count")
    val count: Int?=null,
    @SerializedName("pageIndex")
    val pageIndex: Int?=null,
    @SerializedName("pageSize")
    val pageSize: Int?=null,
    @SerializedName("list")
    val list: List<StationInfo>?= null

)