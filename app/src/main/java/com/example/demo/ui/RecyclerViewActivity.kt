package com.example.demo.ui

import androidx.recyclerview.widget.LinearLayoutManager
import com.example.demo.adapter.OilKindAdapter
import com.example.demo.R
import com.example.demo.databinding.ActivityRecyclerViewBinding
import com.example.demo.ui.base.BaseActivity

class RecyclerViewActivity : BaseActivity<ActivityRecyclerViewBinding>() {
    override val layoutResId: Int
        get() = R.layout.activity_recycler_view

    private val  oilKindAdapter= OilKindAdapter()
    override fun setUp() {
        initRecyclerView2()

    }
    private fun  initRecyclerView2(){
        viewDataBinding.rvOilList.layoutManager= LinearLayoutManager(this)
    viewDataBinding.rvOilList.adapter=oilKindAdapter
        oilKindAdapter.setData(OilKind.mockData())
    }
}