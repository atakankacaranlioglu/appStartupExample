package com.akacaran.startupexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.startup.AppInitializer
import com.akacaran.startupexample.initializers.LibAInitializer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        findViewById<ConstraintLayout>(R.id.root).postDelayed({
            AppInitializer.getInstance(applicationContext)
                .initializeComponent(LibAInitializer::class.java)
        }, 10)
    }

}
