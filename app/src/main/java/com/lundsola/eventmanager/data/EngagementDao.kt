package com.lundsola.eventmanager.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

/**
 * DAO for EngagementEntity.
 */
@Dao
interface EngagementDao {
    @Query("SELECT * FROM engagements")
    fun getAllEngagements(): Flow<List<EngagementEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertEngagement(engagement: EngagementEntity): Long

    @Update
    suspend fun updateEngagement(engagement: EngagementEntity)

    @Delete
    suspend fun deleteEngagement(engagement: EngagementEntity)
}
