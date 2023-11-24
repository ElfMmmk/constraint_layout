package com.example.viewlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addViewProgramatically()
    }

    private fun addViewProgramatically() {
        val root = findViewById<ConstraintLayout>(R.id.root_container)

        val layoutParams = ConstraintLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        val title = TextView(this)
        title.text = "Привееееет!"
        title.layoutParams = layoutParams

        root.addView(title)
    }
}
