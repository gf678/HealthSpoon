package com.healthspoon

import android.content.Intent
import android.os.Bundle
import android.widget.CalendarView
import androidx.appcompat.app.AppCompatActivity

class CalendarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        val calendarView = findViewById<CalendarView>(R.id.calendarView)

        calendarView.setOnDateChangeListener { _, year, month, dayOfMonth ->
            val date = String.format("%04d-%02d-%02d", year, month + 1, dayOfMonth)

            val intent = Intent(this, dfdActivity::class.java)
            intent.putExtra("selectedDate", date)
            startActivity(intent)
        }
    }
}