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
import com.cooking.edit.adapters.FooditemsAdapter
import com.cooking.edit.model.FooditemsModel
import kotlinx.android.synthetic.main.breakfast_layout.view.*

class Breakfastf : Fragment() {
    lateinit var recyclerView: RecyclerView
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var foodList: ArrayList<FooditemsModel>
    lateinit var foodiesAdapters: FooditemsAdapter  //繼承FooditemsAdapter

    //(第一發生) initialize adapter in onCreate, it's unaffected by views state
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    //(第二發生)顯示breakfast_layout的介面
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.breakfast_layout, container, false)
    }

    //(第三發生)initialize recyclerView and layout manager
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = view.my_recycler_view

        // design the gridlayout count/row
        gridLayoutManager = GridLayoutManager(requireContext(), 3, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = gridLayoutManager
        recyclerView.setHasFixedSize(true)

        foodList = ArrayList()      //將foodList作為一個arraylist
        foodList = addfood()        //foodList存放圖片及名稱

        foodiesAdapters = FooditemsAdapter(foodList)    //adapter按照位置擺放foodlist裡的所有物品
        recyclerView.adapter = foodiesAdapters
    }

    fun addfood(): ArrayList<FooditemsModel>{
        foodList.add(FooditemsModel(R.drawable.breakfast1 ,  "燕麥優格杯"))
        foodList.add(FooditemsModel(R.drawable.breakfast2 ,  "草莓蛋吐司"))
        foodList.add(FooditemsModel(R.drawable.breakfast3 , "煎蛋吐司"))
        foodList.add(FooditemsModel(R.drawable.breakfast4 , "起司煎蛋"))
        foodList.add(FooditemsModel(R.drawable.breakfast5 ,  "起士菇菇炒蛋盒子"))
        return foodList
    }
}
