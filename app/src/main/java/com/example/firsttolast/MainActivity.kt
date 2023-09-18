package com.example.firsttolast

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val secondacbuttn = findViewById<Button>(R.id.button)
        secondacbuttn.setOnClickListener(){
            val intent = Intent(this@MainActivity,registrationActivity::class.java)
            startActivity(intent)
        }

        val menubuttn = findViewById<Button>(R.id.button2)
        menubuttn.setOnClickListener(){
            val intent = Intent(this@MainActivity,HomeActivity::class.java)
            startActivity(intent)
        }
        //Toast.makeText(this@MainActivity,"Now call oncreate", Toast.LENGTH_SHORT).show()
    }
    /*override fun onStart() {
        super.onStart()
        Toast.makeText(this@MainActivity, "Now called onStart",Toast.LENGTH_SHORT).show()
    }
    override fun onResume() {
        super.onResume()
        Toast.makeText(this@MainActivity, "Now called onResume",Toast.LENGTH_SHORT).show()
    }
    override fun onPause() {
        super.onPause()
        Toast.makeText(this@MainActivity, "Now called onPause",Toast.LENGTH_SHORT).show()
    }
    override fun onStop() {
        super.onStop()
        Toast.makeText(this@MainActivity, "Now called onStop",Toast.LENGTH_SHORT).show()
    }
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this@MainActivity, "Now called onDestroy",Toast.LENGTH_SHORT).show()
    }*/
}