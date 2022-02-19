package com.vpopov.movienow.feature.movie.list.imp.di

import com.vpopov.movienow.core.navigation.Router
import com.vpopov.movienow.core.util.ViewModelAssistedFactory
import com.vpopov.movienow.feature.movie.list.api.domain.FeatureMovieListInteractor
import com.vpopov.movienow.feature.movie.list.imp.domain.DefaultMovieListInteractor
import com.vpopov.movienow.feature.movie.list.imp.navigation.FeatureMovieListRouter
import com.vpopov.movienow.feature.movie.list.imp.ui.MovieListViewModel
import dagger.Module
import dagger.Provides

@Module
internal class FeatureMovieListModule {
    @Provides
    fun provideInteractor(): FeatureMovieListInteractor {
        return DefaultMovieListInteractor()
    }

    @Provides
    fun provideRouter(): Router {
        return FeatureMovieListRouter()
    }

    @Provides
    fun provideViewModelFactory(
        interactor: FeatureMovieListInteractor
    ): ViewModelAssistedFactory<MovieListViewModel> {
        return ViewModelAssistedFactory {
            MovieListViewModel(interactor, it)
        }
    }
}
