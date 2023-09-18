package com.example.firsttolast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.PopupMenu
import android.widget.Toast
import com.example.firsttolast.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        this.setTitle("ToolBar")

        binding.popup.setOnClickListener {
            val popupMenu = PopupMenu(this@HomeActivity, binding.popup)
            popupMenu.menuInflater.inflate(R.menu.menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { it ->
                Toast.makeText(this@HomeActivity, "You Clicked :" + it.title, Toast.LENGTH_SHORT)
                    .show()
                true
            }
            popupMenu.show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.kotlin -> {
                Toast.makeText(this, "Kotlin", Toast.LENGTH_SHORT).show()
            }

            R.id.java -> {
                Toast.makeText(this, "Java", Toast.LENGTH_SHORT).show()
            }
            R.id.python ->{
                Toast.makeText(this,"Python",Toast.LENGTH_SHORT).show()
            }
            R.id.dart ->{
                Toast.makeText(this,"Dart",Toast.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
    }
