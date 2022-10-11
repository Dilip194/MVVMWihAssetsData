package com.test.bizomtest.model

import javax.inject.Named

data class ClaimFieldOption(
    @Named("name")
    val name: String? = "",
    @Named("label")
    val label: String? = "",
    @Named("belongsto")
    val belongTo: String? = "",
    @Named("hasmany")
    val hasMany: String? = "",
    @Named("claimfield_id")
    val claimFieldId: String? = "",
    @Named("id")
    val id: String? = "",
)