package com.example.dota2herodhevantharezamaap.kotlin.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Hero(
        val name: String? = null,
        val detail: String? = null,
        val image: Int? = null
) : Parcelable