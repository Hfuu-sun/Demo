package com.example.demo.ui

import android.widget.Toast
import androidx.activity.viewModels
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.demo.R
import com.example.demo.adapter.ChargingStationAdapter
import com.example.demo.databinding.ActivityChargingStationListBinding
import com.example.demo.ui.base.BaseActivity
import com.example.demo.vm.ChargingListViewModel

class ChargingStationListActivity : BaseActivity<ActivityChargingStationListBinding>() {
    override val layoutResId: Int
        get() = R.layout.activity_charging_station_list
    private val adapter= ChargingStationAdapter()
    private val  viewModel: ChargingListViewModel by viewModels()
    //获取一个属于当前页面、生命周期安全、自动重建的 ViewModel 对象。

    override fun setUp() {
        initRecyclerView()
        observeData()
        viewModel.loadStationList()
    }
    private fun  initRecyclerView(){
            viewDataBinding.rvChargingList.adapter=adapter
            viewDataBinding.rvChargingList.layoutManager= LinearLayoutManager(this)
    }
    private fun  observeData(){
        viewModel.stations.observe(this){list ->
            adapter.setData(list)
        }
        viewModel.loading.observe(this){loading ->
            viewDataBinding.tvChargingTitle.text=
                if (loading) "充电站加载中..."  else "充电站列表"
        }
        viewModel.error.observe(this){message ->
            Toast.makeText(this,message, Toast.LENGTH_SHORT).show()
        }
    }
}