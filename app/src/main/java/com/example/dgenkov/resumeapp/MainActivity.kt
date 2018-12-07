package com.example.dgenkov.resumeapp

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var workButton = findViewById<Button>(R.id.workButton)

        workButton.setOnClickListener {
            println("workButton pressed")

            var moveToWorkHistory = Intent(getApplicationContext(), WorkHistoryActivity::class.java)
            startActivity(moveToWorkHistory)
        }

        var callButton = findViewById<Button>(R.id.callButton)

        callButton.setOnClickListener {

            var phoneUri = Uri.parse("tel:0883496367")

            var callIntent = Intent(Intent.ACTION_DIAL, phoneUri)
            startActivity(callIntent)
        }

        var emailButton = findViewById<Button>(R.id.emailButton)

        emailButton.setOnClickListener {

            var emailIntent = Intent(Intent.ACTION_SEND)
            emailIntent.setType("plain/text")
            emailIntent.putExtra(Intent.EXTRA_EMAIL, "asd@gmail.com")
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Nice resumee!")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "I really enjoyed your resume")

            startActivity(emailIntent)
        }
    }
}
