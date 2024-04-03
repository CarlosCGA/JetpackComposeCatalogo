package com.example.jetpackcomposecatalogo.composables.dialogs

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.jetpackcomposecatalogo.R
import com.example.jetpackcomposecatalogo.composables.texts.MyTitleDialog

data class AvatarGoogleAccountItem(val avatar: Int, val email: String)

val ACCOUNTS = listOf(
    AvatarGoogleAccountItem(R.drawable.avatar, "carlos@gmail.com"),
)

@Composable
fun MyGoogleChangeAccountDialog(
    accounts: List<AvatarGoogleAccountItem>,
    show: Boolean,
    onDismiss: () -> Unit
) {

    if (show) {

        Dialog(
            onDismissRequest = { onDismiss.invoke() },
            properties = DialogProperties(
                dismissOnBackPress = false,
                dismissOnClickOutside = true
            ),
            content = {
                Column(
                    modifier = Modifier
                        .background(Color.White)
                        .padding(24.dp)
                        .fillMaxWidth()

                ) {
                    MyTitleDialog(text = "Set backup account")
                    accounts.map { account ->
                        AccountItem(accountItem = account)
                    }
                    AccountItem(
                        AvatarGoogleAccountItem(
                            avatar = R.drawable.add,
                            email = "Add account"
                        )
                    )
                }
            }
        )
    }
}

@Preview
@Composable
fun PreviewMyGoogleChangeAccountDialog() {
    var show by remember {
        mutableStateOf(false)
    }
    MyGoogleChangeAccountDialog(ACCOUNTS, show) { show = false }
}

@Composable
private fun AccountItem(accountItem: AvatarGoogleAccountItem) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = Modifier
                .clip(CircleShape)
                .size(40.dp),
            painter = painterResource(id = accountItem.avatar),
            contentDescription = "Avatar",
        )
        Text(
            modifier = Modifier.padding(start = 16.dp),
            text = accountItem.email
        )
    }

}

@Preview
@Composable
fun PreviewAccountItem() {
    AccountItem(
        AvatarGoogleAccountItem(
            avatar = R.drawable.avatar,
            email = "carlos@gmail.com"
        )
    )
}