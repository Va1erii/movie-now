package com.vpopov.movienow.di

import android.content.Context
import com.vpopov.movienow.feature.movie.list.api.FeatureMovieListApi
import com.vpopov.movienow.feature.movie.list.imp.di.FeatureMovieListComponentHolder
import com.vpopov.movienow.feature.movie.list.imp.di.FeatureMovieListDependencies
import dagger.Module
import dagger.Provides

@Module
class FeatureModule {
    @Provides
    fun provideFeatureMovieListDependencies(
        app: Context
    ): FeatureMovieListDependencies {
        return object : FeatureMovieListDependencies {
            override fun app(): Context = app
        }
    }

    @Provides
    fun provideFeatureMovieList(
        dependencies: FeatureMovieListDependencies
    ): FeatureMovieListApi {
        FeatureMovieListComponentHolder.init(dependencies)
        return FeatureMovieListComponentHolder.get()
    }
}
