package com.gamecodeschool.hello1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CoursesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)

        var courses listOf(
        courses("7865657890","Python","567","Ray","major")
        courses("7865546728","HTML","876","Bronze","minor")
        courses("7865678435","CSS","654","Michelle","minor")
        courses("7865765789","Ruby","089","Tim","minor")
        courses("7865890654","Java","980","Tom","major")
        courses("7865432123","JavaScript","987","Tay","major")
        courses("7865432123","C++","543","Cyr","minor")
        courses("7865456","Php","423","Griffin","major")
        courses("7865654321","Ruby","432","Joy","minor")
        courses("7865098765","Rust","544","Jay","major")

        )

    }
    rvCourses.adapter =coursesRecyclerAdapterView




    }
