package com.example.analyticsproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.Firebase
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.analytics
import com.google.firebase.analytics.logEvent

class MainActivity : AppCompatActivity() {

    private lateinit var android: Button
    private lateinit var apple: Button
    private lateinit var redmi: Button
    private lateinit var v: TextView

    //firebase Analyticts
    private lateinit var firebaseAnalytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Obtain the FirebaseAnalytics instance.
        firebaseAnalytics = Firebase.analytics

        android = findViewById(R.id.android);
        apple = findViewById(R.id.apple);
        redmi = findViewById(R.id.redmi);
        v = findViewById(R.id.textView)

        android.setOnClickListener(){
            v.text = "Android".toString()

        }

        apple.setOnClickListener(){
            v.text = "Apple"

        }
        redmi.setOnClickListener(){
            v.text = "Redmi"

        }




    }
}