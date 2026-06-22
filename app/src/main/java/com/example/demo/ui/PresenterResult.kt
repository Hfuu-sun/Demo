package com.example.demo.ui
sealed class PresenterResult<out T>{
    data class Loading(val show: Boolean) : PresenterResult<Nothing>()
    data class Ok<T>(val  value:T) : PresenterResult<T>()
    data class Exception(val  throwable: Throwable) : PresenterResult<Nothing>()
}

