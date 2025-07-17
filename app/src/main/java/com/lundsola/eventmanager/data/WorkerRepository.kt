package com.lundsola.eventmanager.data

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Repository for worker data.
 */
@Singleton
class WorkerRepository @Inject constructor(private val workerDao: WorkerDao) {
    fun getAllWorkers(): Flow<List<WorkerEntity>> = workerDao.getAllWorkers()
    suspend fun insertWorker(worker: WorkerEntity) = workerDao.insertWorker(worker)
    suspend fun updateWorker(worker: WorkerEntity) = workerDao.updateWorker(worker)
    suspend fun deleteWorker(worker: WorkerEntity) = workerDao.deleteWorker(worker)
}
