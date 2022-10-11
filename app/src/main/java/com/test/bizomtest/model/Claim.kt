package com.test.bizomtest.model

import javax.inject.Named

data class Claim(
    @Named("Result")
    val result: Boolean,
    @Named("Reason")
    val reason: String? = "",
    @Named("Claims")
    val claims: List<Claims>? = null,
    )