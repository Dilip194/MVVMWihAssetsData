package io.buildwithnd.demotmdb.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.test.bizomtest.model.ClaimTable

@Database(entities = [ClaimTable::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun claimDao(): ClaimsDao
}