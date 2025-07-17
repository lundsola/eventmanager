package com.lundsola.eventmanager.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lundsola.eventmanager.data.WorkerEntity
import com.lundsola.eventmanager.domain.WorkerUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel for managing workers.
 */
@HiltViewModel
class WorkerViewModel @Inject constructor(
    private val useCases: WorkerUseCases
) : ViewModel() {
    private val _workers = MutableStateFlow<List<WorkerEntity>>(emptyList())
    val workers: StateFlow<List<WorkerEntity>> = _workers.asStateFlow()

    init {
        viewModelScope.launch {
            useCases.getAllWorkers().collect { _workers.value = it }
        }
    }

    fun addWorker(worker: WorkerEntity) = viewModelScope.launch { useCases.addWorker(worker) }
    fun updateWorker(worker: WorkerEntity) = viewModelScope.launch { useCases.updateWorker(worker) }
    fun deleteWorker(worker: WorkerEntity) = viewModelScope.launch { useCases.deleteWorker(worker) }
}
