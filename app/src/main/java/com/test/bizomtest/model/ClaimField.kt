package com.test.bizomtest.model

import javax.inject.Named

data class ClaimField(
    @Named("id")
    val id: String? = "",
    @Named("name")
    val name: String? = "",
    @Named("label")
    val label: String? = "",
    @Named("type")
    val type: String? = "",
    @Named("required")
    val required: String? = "",
    @Named("isdependant")
    val isDependant: String? = "",
    @Named("created")
    val created: String? = "",
    @Named("modified")
    val modified: String? = "",
    @Named("Claimfieldoption")
    val claimFieldOption: List<ClaimFieldOption>? = null,
)