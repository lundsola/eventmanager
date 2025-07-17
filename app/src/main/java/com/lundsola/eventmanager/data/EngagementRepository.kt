package com.lundsola.eventmanager.data

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Repository for engagement data.
 */
@Singleton
class EngagementRepository @Inject constructor(private val engagementDao: EngagementDao) {
    fun getAllEngagements(): Flow<List<EngagementEntity>> = engagementDao.getAllEngagements()
    suspend fun insertEngagement(engagement: EngagementEntity) = engagementDao.insertEngagement(engagement)
    suspend fun updateEngagement(engagement: EngagementEntity) = engagementDao.updateEngagement(engagement)
    suspend fun deleteEngagement(engagement: EngagementEntity) = engagementDao.deleteEngagement(engagement)
}
