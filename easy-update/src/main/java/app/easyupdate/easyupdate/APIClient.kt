package app.easyupdate.easyupdate

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


class APIClient {


    private val baseURL: String = "https://api.publicapis.org/"
    private var retofit: Retrofit? = null


    val client: Retrofit
        get() {
            if (retofit == null) {

                val okHttpClient = OkHttpClient()
                retofit = Retrofit.Builder()
                    .baseUrl(baseURL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retofit!!
        }


}