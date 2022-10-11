package com.test.bizomtest.model

import javax.inject.Named

data class ClaimTypesDetails(
    @Named("claimfield_id")
    val claimFieldId : Int = 0,
    @Named("id")
    val id : Int = 0,
    @Named("claimtype_id")
    val claimTypeId : Int = 0,
    @Named("Claimfield")
    val ClaimField : ClaimField?
) {
}