package com.ryan.news.presentation.view.ui.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar() {

    var searchQuery by rememberSaveable { mutableStateOf("") }
    val hintText: String = "Hint"

    SearchBar(
        modifier = Modifier,
        query = searchQuery,
        onQueryChange = { searchQuery = it },
        onSearch = { query ->
            // Handle search ImeAction.Search here
        },
        active = true,
        onActiveChange = { isActive ->
        },
        placeholder = { Text(hintText) },
        leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) }
    ) {
        // Show suggestions here
        // for example a LazyColumn with suggestion items
    }

}

@Preview
@Composable
fun SearchBarPreview() {
    SearchBar()
}