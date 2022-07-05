package com.car.formula.animation.rally.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.car.formula.animation.rally.R
import com.car.formula.animation.rally.SceneView.FireView

class MainActivity: AppCompatActivity() {
    /** Исходные данные */ //region
    private lateinit var buttonFireOnOff: Button
    private var isFireOn: Boolean = false
    private lateinit var fireWall: FireView
    //endregion

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonFireOnOff = findViewById(R.id.fire_on_off)
        fireWall = findViewById(R.id.firewall)
        buttonFireOnOff.setOnClickListener {
            isFireOn = !isFireOn
            if (isFireOn) fireWall.visibility = View.VISIBLE
            else fireWall.visibility = View.INVISIBLE
        }
    }
}