package com.vpopov.movienow.feature.movie.list.imp.ui

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.vpopov.movienow.feature.movie.list.api.domain.FeatureMovieListInteractor
import com.vpopov.movienow.feature.movie.list.imp.di.FeatureMovieListComponentHolder

internal class MovieListViewModel(
    private val interactor: FeatureMovieListInteractor,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    init {
        interactor.getPopularMovies()
        val args: String? = savedStateHandle[""]
        args
    }

    override fun onCleared() {
        FeatureMovieListComponentHolder.reset()
    }
}
