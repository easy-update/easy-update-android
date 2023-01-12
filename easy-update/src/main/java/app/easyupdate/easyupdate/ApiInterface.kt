package app.easyupdate.easyupdate

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST


@JvmSuppressWildcards
interface ApiInterface {
    @GET("entries")
    fun test(
    ): Call<testResponse>

}