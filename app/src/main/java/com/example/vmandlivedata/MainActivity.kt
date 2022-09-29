package com.example.vmandlivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countTextView = findViewById<TextView>(R.id.tvCount)
        val increaseButton = findViewById<Button>(R.id.btnIncrease)

        increaseButton.setOnClickListener {
            var currentValue:Int = countTextView.text.toString().toInt()
            currentValue++
            countTextView.setText(currentValue.toString())
        }
    }
}

/*Important note:
* when we rotate our device and the screen changes its orientation
* android system usually destroys our applications existing activities & fragments and re-creates them
* why: in that way, our application can reload resources based on new configuration
* some same cases: change the current keyboards, change the language settings
* We call this configuration changes */

/* View model is designed to store and manage the UI related data
*  View model instance stays in the memory until the app finishes its execution*/
