package com.gamecodeschool.hello1import

import com.gamecodeschool.hello1.LoginResponse

import OkHttp3.RequestBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST


interface LoginApiInterface {
    @POST("login")
    fun loginStudent(@Body requestBody: RequestBody):Call<LoginResponse>
}