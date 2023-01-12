package app.easyupdate.easyupdate

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Connector {
     fun callApi(onSuccess: ((testResponse?) -> Unit)? = null, onFailure: ((String) -> Unit)? = null) {
        val apiServices = APIClient().client.create(ApiInterface::class.java)

        val call = apiServices.test()
        call.enqueue(object : Callback<testResponse> {
            override fun onResponse(
                call: Call<testResponse>,
                response: Response<testResponse>
            ) {
                if (response.isSuccessful) {
                    onSuccess?.invoke(response.body())
                } else {

                    onFailure?.invoke("Failure")
                }
            }

            override fun onFailure(call: Call<testResponse>, t: Throwable) {

            }
        })
    }
}