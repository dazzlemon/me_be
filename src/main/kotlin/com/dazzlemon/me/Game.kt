package com.dazzlemon.me

import kotlinx.serialization.*

@Serializable
data class Game(
    val id: String,
    val name: String,
)
