package com.code.explosion

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.observe
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import com.code.explosion.data.AppDatabase
import com.code.explosion.data.SeedDatabaseWorker
import com.google.samples.apps.sunflower.data.PlantRepository

class RoomActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)
    }

    fun select(view: View) {
        val res: PlantRepository = PlantRepository.getInstance(AppDatabase.getInstance(applicationContext).plantDao())
        Log.e("jeremy", "ccc")
        res.getPlants().observe(this) { plants ->
            plants?.forEach {
                Log.e("jeremy", it.toString())
            }
        }
    }

}
