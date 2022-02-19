package com.vpopov.movienow.feature.movie.list.imp.ui

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.vpopov.movienow.core.design.system.DlsTheme

@Composable
internal fun MovieListScreen() {
    DlsTheme {
        Text(text = "Hello MOVIELIST")
    }
}

@Preview
@Composable
internal fun MovieListScreenPreview() {
    MovieListScreen()
}