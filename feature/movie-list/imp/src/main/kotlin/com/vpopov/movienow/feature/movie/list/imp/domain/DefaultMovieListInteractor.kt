package com.vpopov.movienow.feature.movie.list.imp.domain

import com.vpopov.movienow.feature.movie.list.api.domain.FeatureMovieListInteractor
import com.vpopov.movienow.feature.movie.list.api.model.Movie
import kotlinx.coroutines.flow.Flow

internal class DefaultMovieListInteractor: FeatureMovieListInteractor {
    override fun getPopularMovies(): Flow<List<Movie>> {
        TODO("Not yet implemented")
    }

    override suspend fun getMovieById(id: String): Movie? {
        TODO("Not yet implemented")
    }
}
