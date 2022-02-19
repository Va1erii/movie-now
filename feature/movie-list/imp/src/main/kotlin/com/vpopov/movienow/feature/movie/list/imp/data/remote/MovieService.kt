package com.vpopov.movienow.feature.movie.list.imp.data.remote

import com.vpopov.movienow.feature.movie.list.api.model.Movie

internal interface MovieService {
    suspend fun getPopularMovies(): List<Movie>
}
