package com.nepplus.viewpager_20211204

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.viewpager_20211204.adpaters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mvpa : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }


        fun setupEvents(){

        }

        fun setValues() {

            mvpa = MainViewPagerAdapter( supportFragmentManager )
            mainViewPager.adapter = mvpa

//            xml에 있는 탭레이아웃 / 뷰페이저 연결

            mainTabLayout.setupWithViewPager(mainViewPager)


        }


}