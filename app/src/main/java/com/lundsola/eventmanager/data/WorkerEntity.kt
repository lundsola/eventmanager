package com.lundsola.eventmanager.data

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Room entity representing a worker.
 */
@Entity(tableName = "workers")
data class WorkerEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val email: String,
    val phone: String
)
