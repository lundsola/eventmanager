package com.lundsola.eventmanager.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey

/**
 * Room entity representing a worker's engagement in an event.
 */
@Entity(
    tableName = "engagements",
    foreignKeys = [
        ForeignKey(entity = WorkerEntity::class, parentColumns = ["id"], childColumns = ["workerId"], onDelete = ForeignKey.CASCADE),
        ForeignKey(entity = EventEntity::class, parentColumns = ["id"], childColumns = ["eventId"], onDelete = ForeignKey.CASCADE)
    ]
)
data class EngagementEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val workerId: Long,
    val eventId: Long,
    val paid: Boolean = false,
    val notes: String? = null
)
