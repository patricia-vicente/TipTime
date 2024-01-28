package com.example.tiptime

import android.view.LayoutInflater

abstract class ActivityMainBinding {
    abstract val tipResult: Any
    abstract val roundUpSwitch: Any
    abstract val tipOptions: Any
    abstract val calculateButton: Any
    abstract val costOfService: Any
    val root: Any
        get() {
            TODO()
        }

    companion object {
        fun inflate(layoutInflater: LayoutInflater) {

        }
    }

}
