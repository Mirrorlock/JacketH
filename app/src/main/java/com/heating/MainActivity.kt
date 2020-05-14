package com.heating

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        leftSb.setOnSeekBarChangeListener(HeatSeekBarChangeListener(leftTempTv))
        centralSb.setOnSeekBarChangeListener(HeatSeekBarChangeListener(centralTempTv))
        rightSb.setOnSeekBarChangeListener(HeatSeekBarChangeListener(rightTempTv))
    }
}
