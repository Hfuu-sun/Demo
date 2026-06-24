package com.example.demo.vm

import com.example.demo.bean.GasStation
import androidx.databinding.ObservableField

class ItemGasStationViewModel(
    private  val station: GasStation,
    position: Int
){
    val positionText= ObservableField(position.toString())
    val stationName= ObservableField(station.stationName)
    val address= ObservableField(station.address)
    val oilNo  = ObservableField(station.oilNo)
    val price= ObservableField(station.price)
    val distance= ObservableField(station.distance)

}
