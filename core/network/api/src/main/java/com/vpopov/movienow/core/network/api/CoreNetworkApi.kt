package com.vpopov.movienow.core.network.api

import com.vpopov.movienow.core.di.BaseApi

interface CoreNetworkApi : BaseApi {
    fun provideClient(): NetworkClient
}
