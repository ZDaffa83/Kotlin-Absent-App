package com.ai.my.absent.database

import androidx.room.Database
import com.ai.my.absent.model.ModelDatabase
import androidx.room.RoomDatabase
import com.ai.my.absent.database.dao.DatabaseDao



@Database(entities = [ModelDatabase::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun databaseDao(): DatabaseDao?
}