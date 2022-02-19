package com.vpopov.movienow.feature.movie.list.imp.di

import com.vpopov.movienow.core.di.ComponentHolder
import com.vpopov.movienow.feature.movie.list.api.FeatureMovieListApi

object FeatureMovieListComponentHolder :
    ComponentHolder<FeatureMovieListApi, FeatureMovieListDependencies> {
    @Volatile
    private var component: FeatureMovieListComponent? = null

    override fun init(dependencies: FeatureMovieListDependencies) {
        if (component == null) {
            synchronized(FeatureMovieListComponentHolder::class.java) {
                if (component == null) {
                    component = DaggerFeatureMovieListComponent.factory()
                        .create(dependencies.app())
                }
            }
        }
    }

    override fun get(): FeatureMovieListApi {
        return checkNotNull(component) { "FeatureMovieListComponent was not initialized!" }
    }

    internal fun getComponent(): FeatureMovieListComponent {
        return checkNotNull(component) { "FeatureMovieListComponent was not initialized!" }
    }

    override fun reset() {
        component = null
    }
}