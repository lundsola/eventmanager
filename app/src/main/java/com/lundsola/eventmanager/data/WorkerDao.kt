package com.lundsola.eventmanager.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

/**
 * DAO for WorkerEntity.
 */
@Dao
interface WorkerDao {
    @Query("SELECT * FROM workers ORDER BY name")
    fun getAllWorkers(): Flow<List<WorkerEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWorker(worker: WorkerEntity): Long

    @Update
    suspend fun updateWorker(worker: WorkerEntity)

    @Delete
    suspend fun deleteWorker(worker: WorkerEntity)
}
