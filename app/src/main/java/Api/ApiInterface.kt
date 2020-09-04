package Api

import com.gamecodeschool.hello1.RegistrationResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {
    @POST( "register")
    fun registerStudents(@Body requestBody: RequestBody): Call<RegistrationResponse>
}