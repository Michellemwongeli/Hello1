package com.gamecodeschool.hello1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CoursesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)

        var courses listOf(
        courses("7865657890","Erlang","437","Trey","major")
        courses("7865546728","Ruby","766","Brianna","minor")
        courses("7865678435","CSS","654","Mozz","minor")
        courses("7865765789","HTML089","Ian","minor")
        courses("7865890654","Java","980","Dee","major")
        courses("7865432123","JavaScript","987","Jay","major")
        courses("7865432123","C++","543","Cyrystal","minor")
        courses("7865456", "PHP","423","Joan","major")
        courses("7865654321","R","432","Lily","minor")
        courses("7865098765","Rust","544","Christelle","major")

        )

    }
    rvCourses.adapter =coursesRecyclerAdapterView




    }
