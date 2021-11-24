package com.kim.viewpagerpractice_kim.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.kim.viewpagerpractice_kim.GreetingsFragment
import com.kim.viewpagerpractice_kim.MyinfoFragment
import com.kim.viewpagerpractice_kim.NameFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {

        return when(position){

            0 -> "이름"
            1 -> "내 정보"
            else -> "인사말"

        }


    }

    override fun getCount(): Int {

        return 3
    }

    override fun getItem(position: Int): Fragment {

      return when(position){
          0 -> NameFragment()
          1 -> MyinfoFragment()
          else -> GreetingsFragment()

      }
    }
}