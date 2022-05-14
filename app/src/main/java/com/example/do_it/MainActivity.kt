package com.example.do_it

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity()  {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button: Button = findViewById(R.id.button)

        iniciarAPI()

        button.setOnClickListener {
            iniciarAPI()
        }

    }

    fun iniciarAPI(){
        val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        viewModel.getMake()
        viewModel.myResponse.observe(this, Observer {

            CargarType(it.type)
            CargarActivity(it.activity)
            CargarLink(it.link)

        })
    }


    fun CargarType(text:String){
        var type = findViewById<TextView>(R.id.Type)
        type.setText("category : \n$text")
    }

    fun CargarActivity(text:String){
        var activity = findViewById<TextView>(R.id.Activity)
        activity.setText(text)
    }

    fun CargarLink(text:String){

        var link = findViewById<TextView>(R.id.Link)



            link.setText(text)


    }
}