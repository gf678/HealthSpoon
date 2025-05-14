//ResultActivity.kt
package com.healthspoon

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.content.Intent

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // 툴바 연결
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        // 이미지뷰에 사진 넣기
        val imageView = findViewById<ImageView>(R.id.resultImageView)
        imageView.setImageResource(R.drawable.test_food)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_photo -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent) // 플래그 제거
                finish() // ResultActivity 종료
                return true
            }
            R.id.action_info -> {
                // 개인정보 보기
                return true
            }
            R.id.action_food -> {
                val intent = Intent(this, CalendarActivity::class.java)
                startActivity(intent) // 플래그 제거
                finish() // ResultActivity 종료
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}