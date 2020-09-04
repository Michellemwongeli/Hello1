package com.example.hello

import android.animation.ObjectAnimator
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

           if(firstName.isBlank() || firstName.isEmpty()){
               edtFirstName.error="First Name is required"
           }
           if(lastName.isBlank() || lastName.isEmpty()){
               edtLastName.error="Last Name is required"
           }
           if(email.isBlank() || email.isEmpty()){
               edEmail.error="Email is required"
           }
           if(phoneNumber.isBlank() || phoneNumber.isEmpty()){
               edPhoneNumber.error="Phone Number is required"
           }
           if(Password.isBlank() || Password.isEmpty()){
               etPassword.error="Password is required"
           }
           if(confirmPassword.isBlank() || confirmPassword.isEmpty()){
               etPassword.error="Confirm your password"
           }
           progressBar.max=1000
           val currentProgress=600
           ObjectAnimator.ofInt(progressBar,"progress",currentProgress)
               .setDuration(20000)
               .start()
       }
    }
}