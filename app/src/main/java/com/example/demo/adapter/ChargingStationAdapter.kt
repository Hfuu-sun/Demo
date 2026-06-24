package com.example.demo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.demo.bean.StationInfo
import com.example.demo.databinding.ItemChargingStationBinding

class ChargingStationAdapter: RecyclerView.Adapter<ChargingStationAdapter.ChargingStationViewHolder>(){
    private val  data=mutableListOf<StationInfo>()
    fun  setData(list: List<StationInfo>){
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ChargingStationViewHolder {
        val  binding= ItemChargingStationBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,false
        )
        return  ChargingStationViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ChargingStationViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int =data.size
    inner  class  ChargingStationViewHolder(
        private val binding: ItemChargingStationBinding
    ) : RecyclerView.ViewHolder(binding.root){
        fun  bind(item: StationInfo){   //这行就是把数据传给布局，让 XML 能直接用 @{item.name}、@{item.address}
            binding.item=item
            binding.executePendingBindings()   //让数据绑定立刻生效
        }

    }
}