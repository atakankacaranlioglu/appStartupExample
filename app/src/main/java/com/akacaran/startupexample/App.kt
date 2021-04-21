package com.akacaran.startupexample

import android.app.Application
import com.akacaran.startupexample.libs.LibA
import com.akacaran.startupexample.libs.LibB

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        LibA.initialize(applicationContext)
        LibB.initialize(applicationContext)

    }
}