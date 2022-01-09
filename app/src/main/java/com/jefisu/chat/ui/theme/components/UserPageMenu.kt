package com.jefisu.chat.ui.theme.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jefisu.chat.data.model.UserDetail

@Composable
fun UserPageMenu(
    item: UserDetail,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = item.iconId),
                contentDescription = "",
                modifier = Modifier.size(35.dp)
            )
            Spacer(modifier = Modifier.width(30.dp))
            Text(text = item.text, fontSize = 18.sp)
        }
    }
}