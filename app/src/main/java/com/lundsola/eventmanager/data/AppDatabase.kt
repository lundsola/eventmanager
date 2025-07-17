package com.lundsola.eventmanager.data

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * Room database for the app.
 */
@Database(
    entities = [WorkerEntity::class, EventEntity::class, EngagementEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun workerDao(): WorkerDao
    abstract fun eventDao(): EventDao
    abstract fun engagementDao(): EngagementDao
}
