package com.healthspoon

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity // ✅ AppCompatActivity import
import androidx.viewpager2.widget.ViewPager2 // ✅ ViewPager2 import
import androidx.recyclerview.widget.RecyclerView // ✅ RecyclerView import


class dfdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dfdactivity) // ✅ 레이아웃 설정 (파일명 확인 필요)

        val imageSlider = findViewById<ViewPager2>(R.id.imageSlider)
        val images = listOf(
            R.drawable.food1,
            R.drawable.food2,
            R.drawable.food3
        )
        val adapter = ISAdapter(images)
        imageSlider.adapter = adapter
    }
}