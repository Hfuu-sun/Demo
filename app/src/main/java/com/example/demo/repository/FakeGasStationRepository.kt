package com.example.demo.repository

import com.example.demo.bean.GasStation

class  FakeGasStationRepository{
    fun getStationList(): List<GasStation>{
        return listOf(
            GasStation("中石化望京站", "朝阳区望京西路 12 号", "92#", "7.45/L", "1.2km"),
            GasStation("中石油酒仙桥站", "朝阳区酒仙桥北路 8 号", "95#", "7.89/L", "2.6km"),
            GasStation("壳牌北苑站", "朝阳区北苑路 18 号", "98#", "8.32/L", "3.8km")
        )
    }
}