package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.gamecodeschool.hello1.Courses
import com.gamecodeschool.hello1.R
import kotlinx.android.synthetic.main.activity_courses.*



import android.preference.PreferenceManager
import android.widget.Toast
import com.gamecodeschool.hello1.ApiInterface
import com.gamecodeschool.hello1.CoursesAdapter

import kotlinx.android.synthetic.main.activity_courses.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CoursesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)

        fetchCourses()
    }

    fun fetchCourses() {
        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(baseContext)
        val accessToken = sharedPreferences.getString("ACCESS_TOKEN_KEY", "")

        val apiClient = ApiClient.buildService(ApiInterface::class.java)
        val coursesCall = apiClient.getCourses("Bearer " + accessToken)
        coursesCall.enqueue(object : Callback<CoursesResponse> {
            override fun onFailure(call: Call<CoursesResponse>, t: Throwable) {
                Toast.makeText(baseContext, t.message, Toast.LENGTH_LONG).show()
            }

            override fun onResponse(
                call: Call<CoursesResponse>,
                response: Response<CoursesResponse>
            ) {
                if (response.isSuccessful) {
                    var courseList = response.body()?.courses as List<Courses>
                    var coursesAdapter = CoursesAdapter(courseList)
                    rvCourses.layoutManager = LinearLayoutManager(baseContext)
                    val rvCourses = null
                    rvCourses.adapter = coursesAdapter
                } else {
                    Toast.makeText(baseContext, response.errorBody().toString(), Toast.LENGTH_LONG)
                        .show()
                }
            }
        })
    }
}
