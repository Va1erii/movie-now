package com.vpopov.movie.now.core.network.imp.di

import com.vpopov.movie.now.core.network.imp.MovieNetworkClient
import com.vpopov.movie.now.core.network.imp.network.ApiKeyInterceptor
import com.vpopov.movienow.core.network.api.NetworkClient
import dagger.Module
import dagger.Provides
import okhttp3.Interceptor
import javax.inject.Singleton

@Module
internal object CoreNetworkModule {
    @Provides
    @Singleton
    fun provideApiKeyInterceptor(
        dependencies: CoreNetworkDependencies
    ): Interceptor {
        return ApiKeyInterceptor(dependencies.apiKey())
    }

    @Provides
    @Singleton
    fun provideNetworkClient(
        apiKeyInterceptor: Interceptor
    ): NetworkClient {
        return MovieNetworkClient(apiKeyInterceptor)
    }
}