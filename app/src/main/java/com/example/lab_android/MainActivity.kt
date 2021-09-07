package com.example.lab_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    //TODO read jetback and adapterview and recycle view gridview and extracts file xml
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.my_toolbar))
       // supportActionBar?.hide(); to hide app bar programaticlly
    }




}