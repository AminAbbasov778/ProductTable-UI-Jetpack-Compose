package com.example.app3.di

import com.example.app3.data.repository.ProductRepositoryImpl
import com.example.app3.domain.interfaces.ProductRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object Module {
    @Provides
    @Singleton
    fun provideProductRepository(): ProductRepository = ProductRepositoryImpl()
}