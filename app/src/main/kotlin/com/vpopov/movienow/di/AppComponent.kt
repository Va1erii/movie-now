package com.vpopov.movienow.di

import android.content.Context
import com.vpopov.movienow.feature.movie.list.api.FeatureMovieListApi
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        CoreModule::class,
        FeatureModule::class
    ]
)
interface AppComponent {
    fun provideFeatureMovieListApi(): FeatureMovieListApi

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance app: Context): AppComponent
    }
}
