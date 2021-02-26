package com.cooking.edit.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.cooking.edit.R
import com.cooking.edit.models.FoodItemsModel
import kotlinx.android.synthetic.main.cardview_layout.view.*

class FoodItemsAdapter(var context: Context,private var fooditems: ArrayList<FoodItemsModel>) :
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
        holder.icons.setImageResource(fooditems[position].image)
        holder.title.text = fooditems[position].title

        holder.itemView.setOnClickListener{
            Toast.makeText(context,fooditems[position].title,Toast.LENGTH_SHORT).show()

        }
    }
}

class FoodItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var icons: ImageView = itemView.icons_image
    var title: TextView = itemView.title
}



