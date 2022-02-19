package com.vpopov.movienow.feature.login.imp.data

import javax.inject.Inject

interface LoginRepository {
    fun login()
}

class LoginRepositoryImp @Inject constructor(
    private val loginService: LoginService
) : LoginRepository {
    override fun login() {
        loginService.requestToken()
    }
}