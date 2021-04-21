package com.akacaran.startupexample.libs

import android.content.Context
import android.util.Log

class LibB(context: Context) {

    companion object {

        fun initialize(context: Context): LibB {
            Thread.sleep(1000L)
            Log.d("Startup Test ", "Library B started.")
            return LibB(context)
        }
    }

}
