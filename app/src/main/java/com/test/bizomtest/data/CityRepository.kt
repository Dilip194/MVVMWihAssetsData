package com.test.bizomtest.data

import android.content.Context
import com.google.gson.Gson
import com.test.bizomtest.model.Claim
import com.test.bizomtest.model.Result
import kotlinx.coroutines.flow.flow
import java.util.concurrent.Flow

class CityRepository {
    suspend fun getClaims(context: Context) = flow<Result.Success<Claim>>{
        val file_name = "claims_json.json"
        val json_string = context.assets.open(file_name).bufferedReader().use{
            it.readText()
        }
        val gson = Gson()
        val claim = gson.fromJson<Claim>(json_string,Claim::class.java)
    }
}