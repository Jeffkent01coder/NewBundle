package com.jeff.newbundle

import android.content.Intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Toast
import com.jeff.newbundle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button.setOnClickListener {
             Intent(this@MainActivity,Displaydata::class.java)
            val  name = binding.nameid.text.toString()
            val  city = binding.cityid.text.toString()
            intent.putExtra("Name", name)
            intent.putExtra("City", city)
            startActivity(intent)
            Toast.makeText(applicationContext,"Display data:Name $name city:$city" ,Toast.LENGTH_SHORT).show()
        }
    }


//    fun action(v:View)
//    {
//
//        intent = Intent(Intent.ACTION_VIEW)
//        intent.setData(Uri.parse("https://www.google.com/"))
//        startActivity(intent)
//    }



}