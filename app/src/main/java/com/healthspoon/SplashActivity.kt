package com.healthspoon

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 일정 시간 후에 MainActivity로 이동
        Handler().postDelayed({
            // MainActivity로 전환
            startActivity(Intent(this, MainActivity::class.java))
            finish()  // SplashActivity 종료
        }, 1000)  // 2초 대기
    }
}