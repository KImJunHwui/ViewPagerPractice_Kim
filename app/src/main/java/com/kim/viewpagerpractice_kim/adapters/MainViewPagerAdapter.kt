package com.kim.viewpagerpractice_kim.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.kim.viewpagerpractice_kim.GreetingsFragment
import com.kim.viewpagerpractice_kim.MyinfoFragment
import com.kim.viewpagerpractice_kim.NameFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {

        return 3
    }

    override fun getItem(position: Int): Fragment {

        if(position == 0){
            return NameFragment()
        }
        else if(position == 1){
            return MyinfoFragment()
        }
        else{

            return GreetingsFragment()
        }
    }
}