package com.vpopov.movie.now.core.network.imp.di

import com.vpopov.movienow.core.di.ComponentHolder
import com.vpopov.movienow.core.network.api.CoreNetworkApi

object CoreNetworkComponentHolder : ComponentHolder<CoreNetworkApi, CoreNetworkDependencies> {
    @Volatile
    private var coreNetworkComponent: CoreNetworkComponent? = null

    override fun init(dependencies: CoreNetworkDependencies) {
        if (coreNetworkComponent == null) {
            synchronized(CoreNetworkComponentHolder::class.java) {
                if (coreNetworkComponent == null) {
                    coreNetworkComponent = DaggerCoreNetworkComponent.factory()
                        .create(dependencies)
                }
            }
        }
    }

    override fun get(): CoreNetworkApi {
        return checkNotNull(coreNetworkComponent) { "CoreNetworkComponent was not initialized!" }
    }

    override fun reset() {
        coreNetworkComponent = null
    }
}