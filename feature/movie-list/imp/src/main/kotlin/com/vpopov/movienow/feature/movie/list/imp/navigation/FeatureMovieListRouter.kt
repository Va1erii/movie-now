package com.vpopov.movienow.feature.movie.list.imp.navigation

import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.vpopov.movienow.core.navigation.Router
import com.vpopov.movienow.core.util.ViewModelAssistedFactory
import com.vpopov.movienow.feature.movie.list.imp.di.FeatureMovieListComponentHolder
import com.vpopov.movienow.feature.movie.list.imp.ui.MovieListScreen
import com.vpopov.movienow.feature.movie.list.imp.ui.MovieListViewModel
import javax.inject.Inject

internal class FeatureMovieListRouter : Router {
    @Inject
    lateinit var assistedFactory: ViewModelAssistedFactory<MovieListViewModel>

    override fun route(): String = "movie-list"

    override fun register(
        navGraphBuilder: NavGraphBuilder,
        navController: NavController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(route()) {
            FeatureMovieListComponentHolder.getComponent()
                .inject(this)
            val viewModel: MovieListViewModel = viewModel(
                factory = object : ViewModelProvider.Factory {
                    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                        return assistedFactory.create(it.savedStateHandle) as T
                    }
                }
            )
            MovieListScreen()
        }
    }
}
