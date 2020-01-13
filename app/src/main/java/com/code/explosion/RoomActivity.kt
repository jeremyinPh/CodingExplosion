package com.code.explosion

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.code.explosion.data.AppDatabase
import com.code.explosion.data.Plant
import com.code.explosion.data.PlantRepository

class RoomActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)
    }

    fun select(view: View) {
        val res: PlantRepository =
            PlantRepository.getInstance(AppDatabase.getInstance(applicationContext).plantDao())
        Log.e("jeremy", "ccc")
        val list: List<Plant>? = res.getPlants().value
        list?.forEach {
            Log.e("jeremy", it.toString())
        }
    }
}
