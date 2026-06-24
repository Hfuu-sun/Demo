package com.example.demo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.demo.databinding.ItemGasStationBinding
import com.example.demo.ui.GasStation



class DemoAdapter : RecyclerView.Adapter<DemoAdapter.DemoAdapterViewHolder>() {

    private var  data=mutableListOf<GasStation>()
      fun setData(list: List<GasStation>){
          data.clear()
          data.addAll(list)
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): DemoAdapterViewHolder {
        val binding= ItemGasStationBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return DemoAdapterViewHolder(binding)
    }

    override fun onBindViewHolder( //把数据绑定到列表项视图的方法
        holder: DemoAdapterViewHolder,
        position: Int
    ) {
        holder.bind(data[position])

    }

    override fun getItemCount(): Int=data.size
    inner class DemoAdapterViewHolder (
        private val binding: ItemGasStationBinding
    ): RecyclerView.ViewHolder(binding.root)
    {
        fun  bind(item: GasStation){
            binding.tvStationName.text=item.stationName
            binding.tvAddress.text=item.address
            binding.tvOilNo.text=item.oilNo
            binding.tvPrice.text=item.price
            binding.tvDistance.text=item.distance
        }
    }
}