package com.healthspoon

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity // ✅ AppCompatActivity import

class dfdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dfdactivity) // ✅ 레이아웃 설정 (파일명 확인 필요)
    }
}