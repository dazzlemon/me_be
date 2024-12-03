package com.dazzlemon.me

import kotlinx.serialization.*

@Serializable
data class Theme(
    val name: String,
    val background: Long,
    val background2: Long,
    val accent: Long,
    val text: Long,
)
