package com.akacaran.startupexample.initializers

import android.content.Context
import androidx.startup.Initializer
import com.akacaran.startupexample.libs.LibB

class LibBInitializer : Initializer<LibB> {
    override fun create(context: Context): LibB {
        return LibB.initialize(context)
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf()
    }
}