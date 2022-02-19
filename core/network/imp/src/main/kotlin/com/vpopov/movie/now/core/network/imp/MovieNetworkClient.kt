package com.vpopov.movie.now.core.network.imp

import com.vpopov.movienow.core.network.api.NetworkClient
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Inject

internal class MovieNetworkClient @Inject constructor(
    private val apiKeyInterceptor: Interceptor
) : NetworkClient {
    companion object {
        private const val baseUrl = "https://api.themoviedb.org/"
    }

    private fun getRetrofitClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(apiKeyInterceptor)
            .build()
    }

    override fun <T> buildService(clazz: Class<T>): T {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(getRetrofitClient())
            .build()
            .create(clazz)
    }
}
