package com.gamecodeschool.hello1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class row_activity_item : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_row_item)

        data class courses()
        var id:"int"
        var name:String
        var code :"int"
        var instructor:String
        var description: String
    }
}