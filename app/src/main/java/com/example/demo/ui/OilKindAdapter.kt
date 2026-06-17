package com.example.demo.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.demo.databinding.ItemOilKindBinding

class OilKindAdapter : RecyclerView.Adapter<OilKindAdapter.OilKindViewHolder>() {
    private val data = mutableListOf<OilKind>()
    var selectedTag: Int? = null
        private set   //外部可以读，但不能随便改

    fun setData(list: List<OilKind>) {
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()
    }

    fun setSelection(tag: Int) {
        selectedTag = tag
        notifyDataSetChanged()
    }

    fun getSelectedItem(): OilKind? {
        return data.find { it.tag == selectedTag }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OilKindViewHolder {
        val binding= ItemOilKindBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return   OilKindViewHolder(binding)
    }

    override fun onBindViewHolder(holder: OilKindViewHolder,position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int =data.size


    inner class OilKindViewHolder(
        private val binding: ItemOilKindBinding
    ): RecyclerView.ViewHolder(binding.root){    //绑定binding.root的作用：不给某个单独控件绑点击，而是给“整行列表项”绑点击。这样用户点文字、点空白区域、点这一行的大部分区域，都能触发选中。
        fun bind(item: OilKind){
            binding.tvOilName.text=item.name
            binding.cbSelected.isChecked=(item.tag==selectedTag)
            binding.root.setOnClickListener{
                selectedTag=item.tag
                notifyDataSetChanged()
            }
        }
    }
}