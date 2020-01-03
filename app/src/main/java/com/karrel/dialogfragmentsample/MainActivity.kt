package com.karrel.dialogfragmentsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupButtonEvents()
    }

    private fun setupButtonEvents() {
        btnDialog.setOnClickListener {
            val dialog = CustomDialogFragment()
            dialog.show(supportFragmentManager, "sample")
        }
    }
}
