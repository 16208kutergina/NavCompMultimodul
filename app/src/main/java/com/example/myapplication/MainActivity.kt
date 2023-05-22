package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.addCallback
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        onBackPressedDispatcher.addCallback {
            if (!findNavController(R.id.navGraph).popBackStack()) {
                Toast.makeText(this@MainActivity, "Activity", Toast.LENGTH_SHORT).show()
                super.getOnBackPressedDispatcher().onBackPressed()
            }
        }
    }
}