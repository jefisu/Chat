package com.jefisu.chat.data.model

import androidx.annotation.DrawableRes

data class Chat(
    val title: String,
    val subtitle: String,
    val email: String = "",
    @DrawableRes val image: Int,
    val text: String
)