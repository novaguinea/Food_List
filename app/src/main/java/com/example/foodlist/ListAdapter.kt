package com.example.foodlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListAdapter(val listFood: ArrayList<Food>) :
    RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listFood.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val food = listFood[position]

        Glide.with(holder.itemView.context)
            .load(food.pict)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgFood)

        holder.tvTitle.text = food.name
        holder.tvDetails.text = food.detail

    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvTitle: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetails: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgFood: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

}