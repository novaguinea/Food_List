package com.example.foodlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class GridAdapter(val listFood: ArrayList<Food>) :
    RecyclerView.Adapter<GridAdapter.GridViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): GridViewHolder {
        val view: View =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.item_grid, viewGroup, false)
        return GridViewHolder(view)
    }

    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(listFood[position].pict)
            .apply(RequestOptions().override(350, 350))
            .into(holder.imgPhoto)
    }

    override fun getItemCount(): Int {
        return listFood.size
    }

}