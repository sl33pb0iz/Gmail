package com.example.gmail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager

class Homepage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_layout)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        val emails = ArrayList<Email>()
        emails.add(Email("John", "10:00 AM", "Meeting", "Let's have a meeting at 2 PM."))
        emails.add(Email("John", "10:00 AM", "Meeting", "Let's have a meeting at 2 PM."))
        emails.add(Email("Long", "9:00PM", "Long content", "This is very long content, This is very long content, This is very long content, This is very long content, This is very long content, This is very long content, This is very long content."))

        val adapter = CustomAdapter(this, emails)

        val recyclerView: RecyclerView = findViewById(R.id.email_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}
