package com.test.bizomtest.model

import javax.inject.Named

data class ClaimsTypes(
    @Named("name")
    val name: String? = "",
    @Named("id")
    val id: Int = 0,
)