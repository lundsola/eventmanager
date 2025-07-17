package com.lundsola.eventmanager.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

/**
 * DAO for EventEntity.
 */
@Dao
interface EventDao {
    @Query("SELECT * FROM events ORDER BY date DESC")
    fun getAllEvents(): Flow<List<EventEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertEvent(event: EventEntity): Long

    @Update
    suspend fun updateEvent(event: EventEntity)

    @Delete
    suspend fun deleteEvent(event: EventEntity)
}
