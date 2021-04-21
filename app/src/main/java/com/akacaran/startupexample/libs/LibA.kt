package com.akacaran.startupexample.libs

import android.content.Context
import android.util.Log

class LibA(context: Context) {

    companion object {
        private var instance: LibA? = null

        fun initialize(context: Context): LibA {
            Thread.sleep(1000L)
            Log.d("Startup Test ", "Library A started.")
            return LibA(context).also { instance = it }
        }

        fun isInitialized() : Boolean {
            return instance != null
        }
    }
}
