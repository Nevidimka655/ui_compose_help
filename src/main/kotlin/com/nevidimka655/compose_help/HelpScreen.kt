package com.nevidimka655.compose_help

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.nevidimka655.ui.compose_core.PreferencesGroupTitle
import com.nevidimka655.ui.compose_core.theme.spaces

@Composable
fun HelpScreen(modifier: Modifier = Modifier, list: List<Pair<Int, Int>>) = Column(
    modifier = modifier.padding(MaterialTheme.spaces.spaceMedium),
    verticalArrangement = Arrangement.spacedBy(MaterialTheme.spaces.spaceMedium),
) {
    for ((header, text) in list) {
        HelpHeaderText(text = stringResource(id = header))
        HelpText(text = stringResource(id = text))
    }
}

@Preview(showBackground = true)
@Composable
private fun HelpText(text: String = "Test text") = SelectionContainer { Text(text = text) }

@Preview(showBackground = true)
@Composable
private fun HelpHeaderText(text: String = "Test header") = PreferencesGroupTitle(text)