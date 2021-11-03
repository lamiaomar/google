package com.example.google

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Register successfully", Toast.LENGTH_LONG)
            toast.show()
        }

        val text1: TextView = findViewById(R.id.bigerrMass)
        text1.setOnClickListener {
            val toast = Toast.makeText(this, "Instead hve been clicked", Toast.LENGTH_SHORT)
            toast.show()
        }

        val text2: TextView = findViewById(R.id.signIN)
        text2.setOnClickListener {
            val toast = Toast.makeText(this, "Sign in instead", Toast.LENGTH_SHORT)
            toast.show()
        }

    }
    private fun handleKeyEvent(view: View, keyCode: Int): Boolean {
        if (keyCode == KeyEvent.KEYCODE_ENTER) {
            // Hide the keyboard
            val inputMethodManager =
                getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
            return true
        }
        return false
    }
}