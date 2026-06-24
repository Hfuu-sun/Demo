package com.example.demo.ui

import com.example.demo.bean.GasStation
import com.example.demo.repository.FakeGasStationRepository

class StationListPresenter(
    private val  repository: FakeGasStationRepository = FakeGasStationRepository()
)
{
    fun getStationList(responseResultBlock: (PresenterResult<List<GasStation>>)-> Unit){
        responseResultBlock(PresenterResult.Loading(true))
        try {
            val list = repository.getStationList()
            responseResultBlock(PresenterResult.Ok(list))
        }catch (e: Exception){
            responseResultBlock(PresenterResult.Exception(e))
        }
        finally {
            responseResultBlock(PresenterResult.Loading(false))
        }
    }
}
