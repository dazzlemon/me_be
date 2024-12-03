package com.dazzlemon.me

import kotlinx.serialization.*

@Serializable
data class ThemesResponse(
    val data: List<Theme>
)
