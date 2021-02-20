package com.cooking.edit.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cooking.edit.R
import com.cooking.edit.model.FooditemsModel
import kotlinx.android.synthetic.main.cardview_layout.view.*

class FooditemsAdapter(var fooditems: ArrayList<FooditemsModel>) :
    RecyclerView.Adapter<FoodItemHolder>() {

    override fun getItemCount(): Int {
        return fooditems.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodItemHolder {
        val itemHolder =
            LayoutInflater.from(parent.context).inflate(R.layout.cardview_layout, parent, false)
        return FoodItemHolder(itemHolder)

    }

    override fun onBindViewHolder(holder: FoodItemHolder, position: Int) {
        holder.icons.setImageResource(fooditems.get(position).iconsChar)
        holder.title.text = fooditems.get(position).alphaChar
    }
}

class FoodItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var icons: ImageView = itemView.icons_image
    var title: TextView = itemView.title
}



