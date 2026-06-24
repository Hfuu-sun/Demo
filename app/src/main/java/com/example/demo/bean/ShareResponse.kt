package com.example.demo.bean

data class ShareResponse<T> (
val code: Int?,
val msg: String?,
val success: Boolean?,
val data: T?
)
