package com.vpopov.movienow.feature.movie.list.imp.di

import android.content.Context
import com.vpopov.movienow.core.di.BaseDependencies
import com.vpopov.movienow.feature.movie.list.api.FeatureMovieListApi
import com.vpopov.movienow.feature.movie.list.imp.navigation.FeatureMovieListRouter
import dagger.BindsInstance
import dagger.Component

@Component(modules = [FeatureMovieListModule::class])
internal interface FeatureMovieListComponent : FeatureMovieListApi {
    fun inject(router: FeatureMovieListRouter)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance app: Context): FeatureMovieListComponent
    }
}

interface FeatureMovieListDependencies : BaseDependencies {
    fun app(): Context
}