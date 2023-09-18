package com.example.firsttolast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class dataStoreforreg : AppCompatActivity() {
    private lateinit var img:ImageView
    private lateinit var name:TextView
    private lateinit var email:TextView
    private lateinit var gender:TextView
    private lateinit var age:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_storeforreg)
        img = findViewById(R.id.secondmlogo)
        var recieve = getIntent()
        var image = recieve.getIntExtra("image",0)
        img.setImageResource(image)

        name = findViewById(R.id.secondnameEtxt)
        name.setText(intent.getStringExtra("name"))

        email = findViewById(R.id.secondemailEtxt)
        email.setText(intent.getStringExtra("email"))

        gender = findViewById(R.id.secondgenderEtxt)
        gender.setText(intent.getStringExtra("gender"))

        age = findViewById(R.id.secondageEtxt)
        age.setText(intent.getStringExtra("age"))
    }
}