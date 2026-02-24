package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.rvNews)
        rv.layoutManager = LinearLayoutManager(this)

        val newsList = listOf(
            NewsItem("Campus Wi-Fi Upgrade Completed",
                "Network speed improved across all buildings.",
                R.drawable.ic_news_wifi),

            NewsItem("New Library Opening Hours",
                "Library stays open until 10 PM starting next week.",
                R.drawable.ic_news_library),

            NewsItem("Sports Day This Friday",
                "Football and basketball tournaments. Register before Thursday.",
                R.drawable.ic_news_sports),

            NewsItem("Security Reminder",
                "Do not share your credentials. Enable screen lock on devices.",
                R.drawable.ic_news_security),

            NewsItem("Tech Talk: AI in Mobile Apps",
                "Guest speaker on real-world AI features in Android.",
                R.drawable.ic_news_ai),

            NewsItem("Weather Alert",
                "Heavy rain expected this weekend. Drive carefully.",
                R.drawable.ic_news_alert)
        )

        rv.adapter = NewsAdapter(newsList)
    }
}