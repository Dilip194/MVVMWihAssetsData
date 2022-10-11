package io.buildwithnd.demotmdb.data.local

import androidx.room.*
import com.test.bizomtest.model.Claim
import kotlinx.coroutines.flow.Flow

@Dao
interface ClaimsDao {

    /*@Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(claim: List<Claim>)

    @Delete
    fun delete(claim: Claim)

    @Delete
    fun deleteAll(claim: List<Claim>)*/
}