package com.example.homeworkAA.data.network.dto

import kotlinx.serialization.Serializable

@Serializable
data class CastResponse(
    val cast: List<ActorDto>,
)

