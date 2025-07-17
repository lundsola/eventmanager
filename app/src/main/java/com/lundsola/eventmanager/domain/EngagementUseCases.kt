package com.lundsola.eventmanager.domain

import com.lundsola.eventmanager.data.EngagementEntity
import com.lundsola.eventmanager.data.EngagementRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * Use cases for engagement operations.
 */
class EngagementUseCases @Inject constructor(private val repo: EngagementRepository) {
    fun getAllEngagements(): Flow<List<EngagementEntity>> = repo.getAllEngagements()
    suspend fun addEngagement(engagement: EngagementEntity) = repo.insertEngagement(engagement)
    suspend fun updateEngagement(engagement: EngagementEntity) = repo.updateEngagement(engagement)
    suspend fun deleteEngagement(engagement: EngagementEntity) = repo.deleteEngagement(engagement)
}
