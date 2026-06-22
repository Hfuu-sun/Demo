package com.example.demo.ui

class StationListPresenter(
    private val  repository: FakeGasStationRepository= FakeGasStationRepository()
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
