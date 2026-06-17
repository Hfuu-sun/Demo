package com.example.demo.ui

import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.demo.R
import com.example.demo.databinding.ActivityOilPreferencerDemoBinding
import com.example.demo.ui.base.BaseActivity

class OilPreferenceDemoActivity : BaseActivity<ActivityOilPreferencerDemoBinding>() {
    override val layoutResId: Int
        get() =R.layout.activity_oil_preferencer_demo
    private val  oilKindAdapter= OilKindAdapter()
    override fun setUp() {
        initRecyclerView()
        initButtons()
    }
    private  fun initRecyclerView(){
        viewDataBinding.rvOilKind.layoutManager= LinearLayoutManager(this)
        viewDataBinding.rvOilKind.adapter=oilKindAdapter
        oilKindAdapter.setData(OilKind.mockData())
        oilKindAdapter.setSelection(92)
    }
    private  fun initButtons(){
        viewDataBinding.btnConfirm.setOnClickListener {
            val  selected=oilKindAdapter.getSelectedItem()
            Toast.makeText(this,"当前选择: ${selected?.name ?: "未选择"}", Toast.LENGTH_SHORT)
                .show()
        }
        viewDataBinding.btnSkip.setOnClickListener {
            Toast.makeText(this,"跳过选择", Toast.LENGTH_SHORT).show()
        }
    }
}