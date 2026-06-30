package com.example.demo.bean

import com.google.gson.annotations.SerializedName

data class ShareResponse<T> (
    @SerializedName("errCode", alternate = ["code"])
val code: Int?=null,
    @SerializedName("errMessage", alternate = ["msg","message","reason"])
val msg: String?=null,
val success: Boolean?=null,
val data: T?=null
){
    fun  isSuccess(): Boolean{
        return success==true || code==200 || code==0
    }
    fun tip(): String{
        return msg?:"未知错误"
    }
}
