package com.example.demo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.demo.databinding.ItemGasStationBinding
import com.example.demo.ui.GasStation
import com.example.demo.vm.ItemGasStationViewModel

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
        holder.bind(data[position],position)
    }


    override fun getItemCount(): Int =data.size


    inner class GasStationViewHolder(
        private val binding: ItemGasStationBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: GasStation, position: Int) {
            binding.data=item
            binding.viewModel= ItemGasStationViewModel(item, position +1)
            binding.executePendingBindings()
        }
    }
}

