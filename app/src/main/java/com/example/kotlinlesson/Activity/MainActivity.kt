package com.example.kotlinlesson.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinlesson.R
import com.example.kotlinlesson.fragments.NameFragment
import com.example.kotlinlesson.fragments.SecondFragment

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.container_view,SecondFragment())
            .commit()
    }
}