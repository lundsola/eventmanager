package com.lundsola.eventmanager.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lundsola.eventmanager.data.EngagementEntity
import com.lundsola.eventmanager.domain.EngagementUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel for managing engagements.
 */
@HiltViewModel
class EngagementViewModel @Inject constructor(
    private val useCases: EngagementUseCases
) : ViewModel() {
    private val _engagements = MutableStateFlow<List<EngagementEntity>>(emptyList())
    val engagements: StateFlow<List<EngagementEntity>> = _engagements.asStateFlow()

    init {
        viewModelScope.launch {
            useCases.getAllEngagements().collect { _engagements.value = it }
        }
    }

    fun addEngagement(engagement: EngagementEntity) = viewModelScope.launch { useCases.addEngagement(engagement) }
    fun updateEngagement(engagement: EngagementEntity) = viewModelScope.launch { useCases.updateEngagement(engagement) }
    fun deleteEngagement(engagement: EngagementEntity) = viewModelScope.launch { useCases.deleteEngagement(engagement) }
}
