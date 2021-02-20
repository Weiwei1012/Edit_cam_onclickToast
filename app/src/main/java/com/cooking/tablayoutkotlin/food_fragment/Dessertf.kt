package com.cooking.tablayoutkotlin.food_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cooking.tablayoutkotlin.R
import com.cooking.tablayoutkotlin.adapters.FooditemsAdapter
import com.cooking.tablayoutkotlin.model.FooditemsModel
import kotlinx.android.synthetic.main.breakfast_layout.view.*

class Dessertf : Fragment() {
    lateinit var recyclerView: RecyclerView
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var foodList: ArrayList<FooditemsModel>
    lateinit var foodiesAdapters: FooditemsAdapter  //繼承FooditemsAdapter

    //(第一發生) initialize adapter in onCreate, it's unaffected by views state
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    //(第二發生)顯示dessert_layout的介面
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.dessert_layout, container, false)
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
        foodiesAdapters = FooditemsAdapter(foodList)
        recyclerView.adapter = foodiesAdapters

    }


    fun addfood(): ArrayList<FooditemsModel> {
        foodList.add(FooditemsModel(R.drawable.dessert1 ,  "布丁(小美冰淇淋版本)"))
        foodList.add(FooditemsModel(R.drawable.dessert2 , "檸檬醋-十人份"))
        foodList.add(FooditemsModel(R.drawable.dessert3 , "蔬果綠拿鐵-兩人份"))
        foodList.add(FooditemsModel(R.drawable.dessert4 , "金黃芝麻地瓜-兩人份"))
        foodList.add(FooditemsModel(R.drawable.dessert5 , "水果小冰棒-四人份"))
        foodList.add(FooditemsModel(R.drawable.dessert6 , "微笑香蕉蛋糕-四人份"))
        foodList.add(FooditemsModel(R.drawable.dessert7 , "蜂蜜檸檬梅漬小番茄-四人份"))
        foodList.add(FooditemsModel(R.drawable.dessert8 , "法式蘋果克拉芙緹-二人份"))
        foodList.add(FooditemsModel(R.drawable.dessert9 , "巧克力夏威夷豆餅乾-四人份"))
        foodList.add(FooditemsModel(R.drawable.dessert10 , "髒髒派-四人份"))
        foodList.add(FooditemsModel(R.drawable.dessert11 , "迷你優格牛奶司康-四人份"))
        return foodList
    }
}
