package com.example.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gamecodeschool.hello1.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

       btnRegister.setOnClickListener{
          var firstName=edtFirstName.text.toString()
           var lastName=edtLastName.text.toString()
           val email=edEmail.text.toString()
           val phoneNumber=edPhoneNumber.text.toString()
           val Password=edPassword.text.toString()
           val passwordConfirmation=edConfirmPassword.toString( )
       }
    }
}