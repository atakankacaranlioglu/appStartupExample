package com.akacaran.startupexample.libs

import android.content.Context

class LibA(context: Context) {

    companion object {
        private var instance: LibA? = null

        fun initialize(context: Context): LibA {
            Thread.sleep(1000L)
            return LibA(context).also { instance = it }
        }

        fun isInitialized() = instance != null
    }
}