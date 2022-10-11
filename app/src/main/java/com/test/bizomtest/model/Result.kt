package com.test.bizomtest.model

import kotlin.Result

sealed class Result<T> {
    sealed class Loading<T>
    sealed class Success<T>
    sealed class Fail<T>
}