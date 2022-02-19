package com.vpopov.movienow.core.util

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

fun interface ViewModelAssistedFactory<T : ViewModel> {
    fun create(savedStateHandle: SavedStateHandle): T
}