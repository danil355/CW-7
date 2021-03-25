package kz.step.cw_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeViews()
        initializeLiseners()

    }

    private fun initializeViews() {
        textView = findViewById(R.id.textview)
    }

    private fun initializeLiseners() {
            
    }
}