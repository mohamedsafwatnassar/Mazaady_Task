package com.mazaady.android_task.util

import com.mazaady.android_task.domain.model.CustomError


sealed class LoadingErrorState {
    data class ShowError(val error: CustomError) : LoadingErrorState()
    data object ShowNetworkError : LoadingErrorState()
    data object ShowLoading : LoadingErrorState()
    data object HideLoading : LoadingErrorState()
}