package com.jefisu.chat.data.util

import com.jefisu.chat.R
import com.jefisu.chat.data.model.Chat
import com.jefisu.chat.data.model.UserDetail

object Sample {

    val chats = listOf(
        Chat(
            title = "Brunch this weekend?",
            subtitle = "Ali Connors - ",
            image = R.drawable.profile_picture,
            text = "I'll be in your..."
        ),
        Chat(
            title = "Yes!",
            subtitle = "Sandra Adams - ",
            image = R.drawable.person1,
            text = "Do you have Paris reco..."
        ),
        Chat(
            title = "Birthday Gift",
            subtitle = "Jonathen Chen - ",
            image = R.drawable.person2,
            text = "Have any ideas about..."
        ),
        Chat(
            title = "Recipe to try",
            subtitle = "Britta Holt - ",
            image = R.drawable.person3,
            text = "We should eat this: grated..."
        )
    )

    val users = listOf(
        UserDetail(
            iconId = R.drawable.ic_email,
            text = "Inbox"
        ),
        UserDetail(
            iconId = R.drawable.ic_save,
            text = "Item 2"
        ),
        UserDetail(
            iconId = R.drawable.ic_chat,
            text = "Item 3"
        ),
        UserDetail(
            iconId = R.drawable.ic_file,
            text = "Item 4"
        ),
        UserDetail(
            iconId = R.drawable.ic_location,
            text = "Item 5"
        ),
        UserDetail(
            iconId = R.drawable.ic_data_saver,
            text = "Item 6"
        )
    )
}