package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.gamecodeschool.hello1.Courses
import com.gamecodeschool.hello1.R
import kotlinx.android.synthetic.main.activity_courses.*


class CourseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)

        var coursesList = listOf<Courses>(
            Courses("60", "Java", "java87", "Michelle Nthumo", "Java Intro"),
            Courses("50", "JavaScript", "js453", "Purity Maina", "JS Class"),
            Courses("174", "JSON", "json3", "Wycliffe Omar", "JSON classes"),
            Courses("879", "Kotlin", "Kotlin45", "Jeymo", "intro to kot"),
            Courses("654", "Navigating", "Nav34", "Betty Njambi", "Python Intro"),
            Courses("89", "C++", "C++900", "Edwin Gwein", "C++ Class"),
            Courses("909", "Ruby", "Ruby", "Katerina Musa", "Ruby classes")

        )
        rvCourses.layoutManager = LinearLayoutManager(baseContext)
        rvCourses.adapter = CoursesRecyclerViewAdapter(courseList)
    }
}
