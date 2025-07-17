package com.lundsola.eventmanager.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lundsola.eventmanager.data.EventEntity
import com.lundsola.eventmanager.domain.EventUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel for managing events.
 */
@HiltViewModel
class EventViewModel @Inject constructor(
    private val useCases: EventUseCases
) : ViewModel() {
    private val _events = MutableStateFlow<List<EventEntity>>(emptyList())
    val events: StateFlow<List<EventEntity>> = _events.asStateFlow()

    init {
        viewModelScope.launch {
            useCases.getAllEvents().collect { _events.value = it }
        }
    }

    fun addEvent(event: EventEntity) = viewModelScope.launch { useCases.addEvent(event) }
    fun updateEvent(event: EventEntity) = viewModelScope.launch { useCases.updateEvent(event) }
    fun deleteEvent(event: EventEntity) = viewModelScope.launch { useCases.deleteEvent(event) }
}
