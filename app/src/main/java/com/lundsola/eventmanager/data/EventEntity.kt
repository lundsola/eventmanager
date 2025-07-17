package com.lundsola.eventmanager.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

/**
 * Room entity representing an event.
 */
@Entity(tableName = "events")
data class EventEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val date: String, // ISO 8601 format (yyyy-MM-dd)
    val location: String,
    val feePerWorker: Int = 50 // Default 50 SEK
)
