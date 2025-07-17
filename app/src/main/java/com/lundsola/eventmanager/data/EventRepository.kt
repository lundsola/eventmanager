package com.lundsola.eventmanager.data

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Repository for event data.
 */
@Singleton
class EventRepository @Inject constructor(private val eventDao: EventDao) {
    fun getAllEvents(): Flow<List<EventEntity>> = eventDao.getAllEvents()
    suspend fun insertEvent(event: EventEntity) = eventDao.insertEvent(event)
    suspend fun updateEvent(event: EventEntity) = eventDao.updateEvent(event)
    suspend fun deleteEvent(event: EventEntity) = eventDao.deleteEvent(event)
}
