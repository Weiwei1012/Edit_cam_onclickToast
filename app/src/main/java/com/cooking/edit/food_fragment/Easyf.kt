package com.cooking.edit.food_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cooking.edit.R
import com.cooking.edit.adapters.FoodItemsAdapter
import com.cooking.edit.models.FoodItemsModel
import kotlinx.android.synthetic.main.breakfast_layout.view.*

class Easyf : Fragment() {
    lateinit var recyclerView: RecyclerView
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var foodList: ArrayList<FoodItemsModel>
    lateinit var foodiesAdapters: FoodItemsAdapter  //繼承FooditemsAdapter

    //(第一發生) initialize adapter in onCreate, it's unaffected by views state
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    //(第二發生)顯示easy_layout的介面
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.easy_layout, container, false)
    }

    //(第三發生)initialize recyclerView and layout manager
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = view.my_recycler_view

        // design the gridlayout count/row
        gridLayoutManager =
            GridLayoutManager(requireContext(), 3, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = gridLayoutManager
        recyclerView.setHasFixedSize(true)

        foodList = ArrayList()
        foodList = addfood()
        foodiesAdapters = FoodItemsAdapter(requireContext(),foodList)
        recyclerView.adapter = foodiesAdapters

    }

    private fun addfood(): ArrayList<FoodItemsModel> {
        foodList.add(FoodItemsModel(R.drawable.easy1, "低熱量花椰菜炒飯"))
        foodList.add(FoodItemsModel(R.drawable.easy2, "高蛋白便當"))
        foodList.add(FoodItemsModel(R.drawable.easy3, "雞肉蔬菜健康餐"))
        foodList.add(FoodItemsModel(R.drawable.easy4, "嫩煎香料雞胸-兩人份"))
        foodList.add(FoodItemsModel(R.drawable.easy5, "塔香味噌鹽麴烤雞腿排-兩人份"))
        foodList.add(FoodItemsModel(R.drawable.easy6, "紅糟醬烤雞腿排-兩人份"))
        foodList.add(FoodItemsModel(R.drawable.easy7, "野餐似的小學生午餐-一人份"))
        return foodList
    }
}
