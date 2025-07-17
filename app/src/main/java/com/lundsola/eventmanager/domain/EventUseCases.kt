package com.lundsola.eventmanager.domain

import com.lundsola.eventmanager.data.EventEntity
import com.lundsola.eventmanager.data.EventRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * Use cases for event operations.
 */
class EventUseCases @Inject constructor(private val repo: EventRepository) {
    fun getAllEvents(): Flow<List<EventEntity>> = repo.getAllEvents()
    suspend fun addEvent(event: EventEntity) = repo.insertEvent(event)
    suspend fun updateEvent(event: EventEntity) = repo.updateEvent(event)
    suspend fun deleteEvent(event: EventEntity) = repo.deleteEvent(event)
}
