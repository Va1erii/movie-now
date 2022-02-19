package com.vpopov.movienow.feature.login.api

import com.vpopov.movienow.core.di.BaseApi
import com.vpopov.movienow.core.navigation.Router

interface FeatureLoginApi: BaseApi {
    fun router(): Router
}