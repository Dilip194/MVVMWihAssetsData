package com.test.bizomtest.model

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ClaimTable(
    @NonNull
    @PrimaryKey
    var id: Int
) {
}