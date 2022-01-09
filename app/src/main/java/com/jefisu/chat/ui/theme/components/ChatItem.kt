package com.jefisu.chat.ui.theme.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jefisu.chat.data.model.Chat

@Composable
fun ChatItem(item: Chat, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Row(modifier = modifier) {
            Image(
                painter = painterResource(id = item.image),
                contentDescription = "",
                modifier = Modifier
                    .clip(CircleShape)
                    .size(48.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(text = item.title, style = MaterialTheme.typography.h6)
                Spacer(modifier = Modifier.height(2.dp))
                Text(text = "${item.subtitle} ${item.text}", color = Color.DarkGray)
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 56.dp)
                .height(2.dp),
            color = Color.LightGray
        )
    }
}