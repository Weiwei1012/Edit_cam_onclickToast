package com.cooking.tablayoutkotlin.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.cooking.tablayoutkotlin.R
import com.cooking.tablayoutkotlin.adapters.Adapter
import com.google.android.material.tabs.TabLayout


class HomeFragment : Fragment(){
    private lateinit var myFragment : View
    private lateinit var tabLayout : TabLayout
    private lateinit var viewPager : ViewPager
    private lateinit var adapter : Adapter


    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        myFragment = inflater.inflate(R.layout.fragment_home, container, false)
        return myFragment
    }

    override fun onActivityCreated(@Nullable savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setUpViewPager()
        tabLayout.setupWithViewPager(viewPager)
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {}
            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })
    }


    private fun setUpViewPager() {
        // adapter
        adapter = Adapter(childFragmentManager)

        // viewPager
        viewPager = view!!.findViewById(R.id.viewPager)
        viewPager.adapter = adapter

        // tabLayout
        tabLayout = view!!.findViewById(R.id.ingredients)

        // link tabLayout with viewPager
        tabLayout.setupWithViewPager(viewPager)

    }
}
