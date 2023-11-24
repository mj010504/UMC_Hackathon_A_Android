package com.pknu.busannollerwar.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pknu.busannollerwar.presentation.home.contents.Contents
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel() {
    private val _eventFlow = MutableSharedFlow<HomeEvent>()
    val eventFlow get() = _eventFlow.asSharedFlow()

    fun navigateToContents(contents: Contents) = viewModelScope.launch {
        event(HomeEvent.NavigateToContents(contents))
    }

    private fun event(event: HomeEvent) = viewModelScope.launch { _eventFlow.emit(event) }
}