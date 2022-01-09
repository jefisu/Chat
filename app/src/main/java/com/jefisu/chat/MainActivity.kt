package com.jefisu.chat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jefisu.chat.data.util.Sample
import com.jefisu.chat.ui.theme.components.UserPageMenu
import com.jefisu.chat.ui.theme.components.ChatItem
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val sheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden)
            val scaffoldState = rememberScaffoldState()
            val scope = rememberCoroutineScope()

            ModalBottomSheetLayout(
                sheetState = sheetState,
                sheetContent = {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.image2),
                                contentDescription = "",
                                modifier = Modifier
                                    .clip(CircleShape)
                                    .size(48.dp)
                            )
                            Spacer(modifier = Modifier.width(16.dp))
                            Text(
                                text = "Rachel Been",
                                fontSize = 22.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Divider(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 8.dp)
                                .height(1.dp),
                            color = Color.LightGray
                        )
                        LazyColumn {
                            items(Sample.users) {
                                UserPageMenu(
                                    item = it,
                                    modifier = Modifier.fillMaxWidth()
                                )
                            }
                        }
                    }
                },
                content = {
                    Scaffold(
                        scaffoldState = scaffoldState,
                        floatingActionButton = {
                            FloatingActionButton(onClick = { scope.launch { sheetState.show() } }) {
                                Icon(
                                    imageVector = Icons.Default.Menu,
                                    contentDescription = "Menu"
                                )
                            }
                        },
                        content = {
                            Column {
                                Column(modifier = Modifier.padding(16.dp)) {
                                    Text(text = "Inbox", fontSize = 28.sp)
                                    Spacer(modifier = Modifier.height(10.dp))
                                    Text(text = "Today", fontSize = 19.sp)
                                }
                                LazyColumn {
                                    items(Sample.chats) {
                                        ChatItem(
                                            item = it,
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(start = 8.dp)
                                        )
                                        Spacer(modifier = Modifier.height(16.dp))
                                    }
                                }
                            }
                        }
                    )
                }
            )
        }
    }
}