package models

import com.google.gson.annotations.SerializedName
//import ke.co.hello1.models.Course
import models.Courses

data class CoursesResponse(
    @SerializedName("courses") var courses: List<Courses>
)