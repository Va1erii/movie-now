package com.vpopov.movie.now.core.network.imp.network

import okhttp3.Interceptor
import okhttp3.Response

internal class ApiKeyInterceptor(
    private val apiKey: String
) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
            .newBuilder()
            .addHeader("api_key", apiKey)
            .build()
        return chain.proceed(request)
    }
}
