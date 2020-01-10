package com.example.submission.Models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LanguageModel(
    var name: String = "",
    var detail: String = "",
    var creator: String = "",
    var release: Int = 1990,
    var logo: Int = 0
) : Parcelable