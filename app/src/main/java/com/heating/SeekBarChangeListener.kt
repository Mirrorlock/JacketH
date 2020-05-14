package com.heating

import android.widget.SeekBar
import android.widget.TextView

class HeatSeekBarChangeListener(private val changedView: TextView) : SeekBar.OnSeekBarChangeListener{
    private val temperatures= arrayOf(0, 30, 36, 42, 50)

    override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
        changedView.text = temperatures[p1].toString() + "°C"
    }

    override fun onStartTrackingTouch(p0: SeekBar?) {
    }

    override fun onStopTrackingTouch(p0: SeekBar?) {
    }

}