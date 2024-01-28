package com.example.tiptime

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.example.tiptime.databinding.ActivityMainBinding
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import java.text.NumberFormat
import kotlin.math.ceil
import kotlin.time.times

private val Any.checkedRadioButtonID: Any
    get() {
        TODO("Not yet implemented")
    }

private val Any.text: Any
    get() {
        TODO("Not yet implemented")
    }

private val Any.costOfServiceEditText: Any
    get() {
        TODO("Not yet implemented")
    }

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculateButton.setOnClickListener{ calculateTip() }
    }

    private fun handKeyEvent(view: Any, keyCode: Any) {
        TODO("Not yet implemented")
    }


    fun calculateTip() {
        val stringInTextField = binding.costOfService.text.toString()
        val cost = stringInTextField.toDouble()
        val selectedId = binding.tipOptions.checkedRadioButtonId
        val tipPercentage = when (selectedId) {
            R.id.option_twenty_percent -> 0.20
            R.id.option_eighteen_percent -> 0.18
            else -> 0.15
        }
        var tip = tipPercentage * cost
        val roundUp = binding.roundUpSwitch.isChecked
        if (roundUp) {
            tip = ceil(tip)
        }
        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        binding.tipResult.text = getString(R.string.tip_amount, formattedTip)

    }

private fun Any.setonKeyListener(any: Any) {
    TODO("Not yet implemented")
}

private fun Any.setOnClickListener(function: () -> Unit) {
    TODO("Not yet implemented")
}
}
