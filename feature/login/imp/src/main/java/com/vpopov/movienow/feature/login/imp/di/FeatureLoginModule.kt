package com.vpopov.movienow.feature.login.imp.di

import com.vpopov.movienow.core.navigation.Router
import com.vpopov.movienow.core.network.api.CoreNetworkApi
import com.vpopov.movienow.feature.login.imp.data.LoginService
import com.vpopov.movienow.feature.login.imp.navigation.FeatureLoginRouter
import dagger.Module
import dagger.Provides

@Module
class FeatureLoginModule {
    @Provides
    fun provideRouter(): Router {
        return FeatureLoginRouter()
    }

    @Provides
    fun provideLoginService(
        coreNetworkApi: CoreNetworkApi
    ): LoginService {
        return coreNetworkApi.provideClient()
            .buildService(LoginService::class.java)
    }
}