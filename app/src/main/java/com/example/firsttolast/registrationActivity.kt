package com.example.firsttolast

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class registrationActivity : AppCompatActivity() {
    private lateinit var fbutton:Button
    private lateinit var name:EditText
    private lateinit var email:EditText
    private lateinit var gender:EditText
    private lateinit var age:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        fbutton = findViewById(R.id.registerbtn)
        name = findViewById((R.id.nameEtxt))
        email = findViewById(R.id.emailEtxt)
        gender = findViewById(R.id.gender)
        age = findViewById(R.id.ageEtxt)




        fbutton.setOnClickListener {

            var seename:String = name.getText().toString()
            var seeemail:String = email.getText().toString()
            var seegender:String = gender.getText().toString()
            var seeage:String = age.getText().toString()
            var intent = Intent(this@registrationActivity,dataStoreforreg::class.java)
            intent.putExtra("image",R.drawable.logo)
            intent.putExtra("name",seename)
            intent.putExtra("email",seeemail)
            intent.putExtra("gender",seegender)
            intent.putExtra("age",seeage)
            startActivity(intent)
            finish()
        }
    }
}