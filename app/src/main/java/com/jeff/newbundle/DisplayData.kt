package com.jeff.newbundle

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.jeff.newbundle.databinding.ActivityDisplayDataBinding

class Displaydata : AppCompatActivity()

{
    private lateinit var binding: ActivityDisplayDataBinding
    override fun onCreate(savedInstanceState: Bundle?)
    {
        binding = ActivityDisplayDataBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val bundle: Bundle? = intent.extras
        val strUser = bundle!!.getString("Name")
        val strCity = bundle!!.getString("City")


        binding.textName.setText(strUser)
        binding.textCity.setText(strCity)




    }


    fun back_action(v: View)
    {
        val intent: Intent = Intent(this@Displaydata,MainActivity::class.java)
        startActivity(intent)
    }
}