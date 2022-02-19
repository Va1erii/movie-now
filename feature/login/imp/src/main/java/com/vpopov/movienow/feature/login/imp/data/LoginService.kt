package com.vpopov.movienow.feature.login.imp.data

import retrofit2.http.GET

interface LoginService {
    @GET("3/authentication/token/new")
    fun requestToken()
}