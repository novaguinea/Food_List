package com.example.foodlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.item_row.view.*

class CardViewAdapter(private val listFood: ArrayList<Food>) :
    RecyclerView.Adapter<CardViewAdapter.CardViewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_cardview, parent, false)
        return CardViewViewHolder(view)
    }

    override fun getItemCount() = listFood.size

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        holder.bin(listFood[position])
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bin(food: Food) {
            with(itemView) {
                Glide.with(itemView.context)
                    .load(food.pict)
                    .apply(RequestOptions().override(350, 550))
                    .into(img_item_photo)

                tv_item_name.text = food.name
                tv_item_detail.text = food.detail
            }
        }
    }


}