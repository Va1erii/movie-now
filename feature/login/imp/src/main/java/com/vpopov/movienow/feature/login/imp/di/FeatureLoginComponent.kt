package com.vpopov.movienow.feature.login.imp.di

import com.vpopov.movienow.core.network.api.CoreNetworkApi
import com.vpopov.movienow.feature.login.api.FeatureLoginApi
import dagger.BindsInstance
import dagger.Component

@Component(modules = [FeatureLoginModule::class])
interface FeatureLoginComponent : FeatureLoginApi {
    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance coreNetworkApi: CoreNetworkApi
        ): FeatureLoginComponent
    }
}