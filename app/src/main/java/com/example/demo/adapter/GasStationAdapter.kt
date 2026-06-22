package com.example.demo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.demo.databinding.ItemGasStationBinding
import com.example.demo.ui.GasStation

class GasStationAdapter: RecyclerView.Adapter<GasStationAdapter.GasStationViewHolder>() {
    private val data = mutableListOf<GasStation>()
    fun setData(list: List<GasStation>) {
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): GasStationViewHolder {
        val binding= ItemGasStationBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return GasStationViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: GasStationViewHolder,
        position: Int
    ) {
        holder.bind((data[position]))
    }


    override fun getItemCount(): Int =data.size

    inner class GasStationViewHolder(
        private val binding: ItemGasStationBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: GasStation) {
            binding.tvStationName.text = item.stationName
            binding.tvAddress.text = item.address
            binding.tvOilNo.text = item.oilNo
            binding.tvPrice.text = item.price
            binding.tvDistance.text = item.distance
        }
    }
}

