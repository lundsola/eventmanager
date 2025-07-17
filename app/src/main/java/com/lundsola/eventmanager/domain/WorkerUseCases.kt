package com.lundsola.eventmanager.domain

import com.lundsola.eventmanager.data.WorkerEntity
import com.lundsola.eventmanager.data.WorkerRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * Use cases for worker operations.
 */
class WorkerUseCases @Inject constructor(private val repo: WorkerRepository) {
    fun getAllWorkers(): Flow<List<WorkerEntity>> = repo.getAllWorkers()
    suspend fun addWorker(worker: WorkerEntity) = repo.insertWorker(worker)
    suspend fun updateWorker(worker: WorkerEntity) = repo.updateWorker(worker)
    suspend fun deleteWorker(worker: WorkerEntity) = repo.deleteWorker(worker)
}
