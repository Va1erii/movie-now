package com.vpopov.movienow.feature.movie.list.imp.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vpopov.movienow.core.design.system.DlsTheme
import com.vpopov.movienow.feature.movie.list.api.model.Movie

@Composable
internal fun MovieListScreen(state: MovieListUIState) {
    DlsTheme {
        Surface {
            LazyColumn {
                items(state.movies) { movie ->
                    MovieListItem(
                        movie = movie,
                        onItemClicked = state.onItemClicked
                    )
                }
            }
            LaunchedEffect(
                key1 = state.errors,
                block = {
                }
            )
        }
    }
}

@Composable
internal fun MovieListItem(movie: Movie, onItemClicked: (Movie) -> Unit) {
    Text(
        modifier = Modifier
            .height(60.dp)
            .clickable { onItemClicked(movie) },
        text = movie.title
    )
}

data class MovieListUIState(
    val isLoading: Boolean,
    val errors: List<String>,
    val movies: List<Movie>,
    val onItemClicked: (Movie) -> Unit
)

@Preview
@Composable
internal fun MovieListScreenPreview() {
    MovieListScreen(
        MovieListUIState(
            isLoading = false,
            errors = emptyList(),
            movies = listOf(
                Movie("1", "title 1"),
                Movie("2", "title 2"),
                Movie("3", "title 3")
            ),
            onItemClicked = {}
        )
    )
}
