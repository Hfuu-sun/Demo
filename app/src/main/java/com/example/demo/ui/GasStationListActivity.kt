package com.example.demo.ui

import androidx.recyclerview.widget.LinearLayoutManager
import com.example.demo.R
import com.example.demo.adapter.GasStationAdapter
import com.example.demo.databinding.ActivityRecyclerViewBinding
import com.example.demo.ui.base.BaseActivity

class GasStationListActivity : BaseActivity<ActivityRecyclerViewBinding>() {
    override val layoutResId: Int
        get() = R.layout.activity_recycler_view

    private val gasStationAdapter = GasStationAdapter()
    private val stationListPresenter = StationListPresenter()
    override fun setUp() {
        initRecyclerView2()
        loadStationList()
    }

    private fun initRecyclerView2() {
        viewDataBinding.rvOilList.layoutManager = LinearLayoutManager(this)
        viewDataBinding.rvOilList.adapter = gasStationAdapter
    }
    private fun loadStationList() {
        stationListPresenter.getStationList  {
            result ->
            when(result) {
                is PresenterResult.Loading->{}
                is PresenterResult.Ok->{
                    gasStationAdapter.setData(result.value)
                }
                is PresenterResult.Exception->{}
            }
        }
    }
}
