package com.jefisu.chat.data.model

import androidx.annotation.DrawableRes

data class UserDetail(
    val name: String = "",
    val email: String = "",
    @DrawableRes val iconId: Int,
    val text: String
)
