package com.example.demo.vm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.demo.bean.StationInfo
import com.example.demo.repository.ChargingStationRepository
import kotlinx.coroutines.launch

class ChargingListViewModel: ViewModel()
{
    //类的成员
    private  val repository = ChargingStationRepository()
    val loading= MutableLiveData<Boolean>()
    val error= MutableLiveData<String>()
    val stations= MutableLiveData<List<StationInfo>>()  //请求成功后的充电站列表
    fun loadStationList(){
        viewModelScope.launch {
            loading.value=true
            try {
                val response=repository.getStationList()
                if (response.isSuccess()&& response.data?.list!=null){
                    stations.value=response.data.list
                }
                else{
                    error.value=response.tip()
                }
            }
            catch (throwable: Throwable){
                error.value=throwable.message?:"网络请求异常"
            }finally {
                loading.value=false
            }
        }
    }
}
