package com.gamecodeschool.hello1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnLogIn.setOnClickListener(){
            var email=etEmail.text.toString()
            var password=etPassword.text.toString()
            Toast.makeText((baseContext),email,Toast.LENGTH_LONG).show()
        }
    }
}