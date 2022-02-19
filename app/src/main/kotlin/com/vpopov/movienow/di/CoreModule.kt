package com.vpopov.movienow.di

import com.vpopov.movie.now.core.network.imp.di.CoreNetworkComponentHolder
import com.vpopov.movie.now.core.network.imp.di.CoreNetworkDependencies
import com.vpopov.movienow.core.network.api.CoreNetworkApi
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CoreModule {
    @Provides
    @Singleton
    fun provideCoreNetworkApi(): CoreNetworkApi {
        CoreNetworkComponentHolder.init(object : CoreNetworkDependencies {
            override fun apiKey(): String = "api_key"
        })
        return CoreNetworkComponentHolder.get()
    }
}
