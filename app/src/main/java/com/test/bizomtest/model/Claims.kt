package com.test.bizomtest.model

import javax.inject.Named

data class Claims(
    @Named("Claimtype")
    val claimsTypes: ClaimsTypes? = null,
    @Named("Claimtypedetail")
    val claimTypesDetails: List<ClaimTypesDetails>? = null
)