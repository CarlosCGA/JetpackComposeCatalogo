package com.example.jetpackcomposecatalogo.composables

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandHorizontally
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposecatalogo.composables.model.Routes
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyScaffold(navigationController: NavHostController) {
    val colors = listOf(
        Color(0xFFffd7d7.toInt()),
        Color(0xFFffe9d6.toInt()),
        Color(0xFFfffbd0.toInt()),
        Color(0xFFe3ffd9.toInt()),
        Color(0xFFd0fff8.toInt())
    )

    val snackBarState = remember { SnackbarHostState() }
    val coroutineScope = rememberCoroutineScope()

    val scrollState = rememberLazyListState()

    Scaffold(
        modifier = Modifier.height(350.dp),
        snackbarHost = {
            SnackbarHost(
                hostState = snackBarState,
                snackbar = {
                    Snackbar(modifier = Modifier.padding(8.dp), content = {
                        Text(text = it.visuals.message)
                    })
                }
            )
        },
        topBar = {
            MyTopAppBar(
                navigationController = navigationController
            ) { coroutineScope.launch { snackBarState.showSnackbar("Click on $it") } }
        },
        content = { innerPadding ->
            LazyColumn(
                // consume insets as scaffold doesn't do it by default
                modifier = Modifier.consumeWindowInsets(innerPadding),
                contentPadding = innerPadding,
                state = scrollState
            ) {
                items(count = 100) {
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .background(colors[it % colors.size])
                    )
                }
            }
        },
        bottomBar = { MyBottomNavigation() },
        floatingActionButton = { MyFloatingActionButton(scrollState) },
        floatingActionButtonPosition = FabPosition.End,
    )
}

@ExperimentalMaterial3Api
@Composable
fun MyTopAppBar(navigationController: NavHostController, onClickIcon: (String) -> Unit) {
    TopAppBar(
        title = { Text("Simple Scaffold Screen") },
        navigationIcon = {
            IconButton(
                onClick = {
                    navigationController.navigate(Routes.AllContent.route)
                }
            ) {
                Icon(
                    modifier = Modifier
                        .rotate(90F),
                    imageVector = Icons.Filled.KeyboardArrowDown,
                    contentDescription = "Back"
                )
            }
        },
        actions = {
            IconButton(
                onClick = {
                    onClickIcon("Search")
                }
            ) {
                Icon(
                    modifier = Modifier
                        .rotate(90F),
                    imageVector = Icons.Filled.Search,
                    contentDescription = "Search"
                )
            }
            IconButton(
                onClick = {
                    navigationController.navigate(Routes.AllContent.route)
                }
            ) {
                Icon(
                    modifier = Modifier
                        .rotate(90F),
                    imageVector = Icons.Filled.Close,
                    contentDescription = "Close"
                )
            }
        }
    )
}

@Composable
fun MyBottomNavigation() {
    var index by rememberSaveable {
        mutableIntStateOf(0)
    }

    NavigationBar {
        NavigationBarItem(selected = index == 0, onClick = { index = 0 }, icon = {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Home"
            )
        },
            label = { Text(text = "Home") })

        NavigationBarItem(selected = index == 1, onClick = { index = 1 }, icon = {
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = "FAV"
            )
        },
            label = { Text(text = "FAV") })

        NavigationBarItem(selected = index == 2, onClick = { index = 2 }, icon = {
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "Profile"
            )
        },
            label = { Text(text = "Profile") })
    }
}

@Composable
fun MyFloatingActionButton(scrollState: LazyListState) {
    FloatingActionButton(
        onClick = { },
        contentColor = Color.Yellow,
        containerColor = Color.Red
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                modifier = Modifier.size(20.dp),
                imageVector = Icons.Filled.Create,
                contentDescription = "Gmail FAB"
            )

            val showText by remember {
                derivedStateOf {
                    scrollState.firstVisibleItemIndex == 0
                }
            }

            AnimatedVisibility(
                visible = showText,
                enter =
                expandHorizontally(
                    expandFrom = Alignment.End
                ) + fadeIn(
                    initialAlpha = 0f
                ),
                exit = shrinkHorizontally(shrinkTowards = Alignment.End) + fadeOut()
            ) {
                Text(
                    modifier = Modifier
                        .padding(start = 8.dp),
                    text = "Gmail FAB"
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewMyScaffold() {
    val navigationController = rememberNavController()
    MyScaffold(navigationController)
}
