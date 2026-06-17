package com.example.demo.util
import android.util.Log

object LogUtil{    //全局调用
    private const val TAG="Demo"
    fun d(msg: String){
        Log.d(TAG,msg)  //debug级别的日志
    }
}


