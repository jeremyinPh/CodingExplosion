package com.code.explosion

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun MVVM(view: View) {

    }

    fun Retrofit(view: View) {

    }

    fun Room(view: View) {
        startActivity(Intent(this, RoomActivity::class.java))
    }

    fun RecycleView(view: View) {

    }
}
