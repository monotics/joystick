package com.monotics.app.joystick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.monotics.view.joystick.JoystickView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val joystickView = findViewById<JoystickView>(R.id.joystick)
        val angleValueView = findViewById<TextView>(R.id.value_angle)
        val strengthValueView = findViewById<TextView>(R.id.value_strength)
        joystickView.setOnMoveListener({ angle, strength ->
            angleValueView.text = "angle : ${angle}"; strengthValueView.text = "strength : ${strength}"
        }, 100)
    }
}