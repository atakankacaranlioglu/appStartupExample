package com.akacaran.startupexample.libs

import android.content.Context
import android.util.Log

class LibB(context: Context) {

    companion object {

        fun initialize(context: Context): LibB {
            Thread.sleep(1000L)
            val result = if (LibA.isInitialized()) {
                "Library A initialized."
            } else {
                "Library A not initialized."
            }
            Log.d("Library B : ", result)
            return LibB(context)
        }
    }

}