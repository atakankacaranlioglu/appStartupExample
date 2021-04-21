package com.akacaran.startupexample.initializers

import android.content.Context
import androidx.startup.Initializer
import com.akacaran.startupexample.libs.LibA

class LibAInitializer : Initializer<LibA> {

    override fun create(context: Context): LibA {
        return LibA.initialize(context)
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf()
    }
}