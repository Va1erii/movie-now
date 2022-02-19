package com.vpopov.movie.now.core.network.imp.di

import com.vpopov.movienow.core.di.BaseDependencies
import com.vpopov.movienow.core.network.api.CoreNetworkApi
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [CoreNetworkModule::class])
internal interface CoreNetworkComponent : CoreNetworkApi {
    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance dependencies: CoreNetworkDependencies
        ): CoreNetworkComponent
    }
}

interface CoreNetworkDependencies : BaseDependencies {
    fun apiKey(): String
}