package com.ubaysapplication.app.modules.androidlargeone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ubaysapplication.app.R
import com.ubaysapplication.app.databinding.RowGridfifacounterBinding
import com.ubaysapplication.app.modules.androidlargeone.`data`.model.GridfifacounterRowModel
import kotlin.Int
import kotlin.collections.List

class GridfifacounterAdapter(
  var list: List<GridfifacounterRowModel>
) : RecyclerView.Adapter<GridfifacounterAdapter.RowGridfifacounterVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridfifacounterVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridfifacounter,parent,false)
    return RowGridfifacounterVH(view)
  }

  override fun onBindViewHolder(holder: RowGridfifacounterVH, position: Int) {
    val gridfifacounterRowModel = GridfifacounterRowModel()
    // TODO uncomment following line after integration with data source
    // val gridfifacounterRowModel = list[position]
    holder.binding.gridfifacounterRowModel = gridfifacounterRowModel
  }

  override fun getItemCount(): Int = 9
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridfifacounterRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: GridfifacounterRowModel
    ) {
    }
  }

  inner class RowGridfifacounterVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridfifacounterBinding = RowGridfifacounterBinding.bind(itemView)
  }
}
