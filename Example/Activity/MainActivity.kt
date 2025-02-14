package erickc.appsplus.readmore.textview

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        val readMoreTextView: ReadMoreTextView = findViewById(R.id.readMoreTextView)

    }
}