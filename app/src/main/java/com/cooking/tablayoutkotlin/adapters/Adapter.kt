package com.cooking.tablayoutkotlin.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.cooking.tablayoutkotlin.food_fragment.*


class Adapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager)  {
    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> Breakfastf()
            1 -> Ricef()
            2 -> Easyf()
            3 -> Sidedishf()
            4 -> Noodlesf()
            5 -> Soupf()
            6 ->  Vegetablef()
            7 -> Meatf()
            8 -> Fruitf()
            else -> Dessertf()
        }
    }

    override fun getCount(): Int {
        return 10
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when(position){
            0 -> "早餐"
            1 -> "飯食"
            2 -> "便當"
            3 -> "配菜"
            4 -> "麵食"
            5 -> "湯品"
            6 -> "蔬菜"
            7 -> "肉類"
            8 -> "水果"
            else -> "甜點"
        }
    }
}