package com.example.launchmode

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityB :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val buttonB: Button = findViewById(R.id.button11)
        val buttonA: Button = findViewById(R.id.button12)
        val buttonD: Button = findViewById(R.id.button13)
        val buttonC: Button = findViewById(R.id.button14)
        buttonA.setOnClickListener{

            val intent = Intent(this, ActivityA::class.java)
            Log.d("ACtivity A","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
            //intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)

        }
        buttonB.setOnClickListener{
            val intent = Intent(this, ActivityB::class.java)
            startActivity(intent)
        }
        buttonC.setOnClickListener{
            val intent = Intent(this, ActivityC::class.java)
            startActivity(intent)
        }
        buttonD.setOnClickListener{
            val intent = Intent(this, ActivityD::class.java)
            startActivity(intent)
        }
    }
}