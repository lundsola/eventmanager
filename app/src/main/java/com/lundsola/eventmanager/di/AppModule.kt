package com.lundsola.eventmanager.di

import android.content.Context
import androidx.room.Room
import com.lundsola.eventmanager.data.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Hilt module for providing app dependencies.
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideDatabase(appContext: Context): AppDatabase =
        Room.databaseBuilder(appContext, AppDatabase::class.java, "eventmanager.db").build()

    @Provides
    fun provideWorkerDao(db: AppDatabase): WorkerDao = db.workerDao()

    @Provides
    fun provideEventDao(db: AppDatabase): EventDao = db.eventDao()

    @Provides
    fun provideEngagementDao(db: AppDatabase): EngagementDao = db.engagementDao()

    @Provides
    fun provideWorkerRepository(workerDao: WorkerDao): WorkerRepository = WorkerRepository(workerDao)

    @Provides
    fun provideEventRepository(eventDao: EventDao): EventRepository = EventRepository(eventDao)

    @Provides
    fun provideEngagementRepository(engagementDao: EngagementDao): EngagementRepository = EngagementRepository(engagementDao)
}
