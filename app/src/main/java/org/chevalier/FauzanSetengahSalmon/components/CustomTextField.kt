package org.chevalier.FauzanSetengahSalmon.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.VisualTransformation
import org.chevalier.FauzanSetengahSalmon.R

@Composable
fun CustomTextField(
    modifier: Modifier = Modifier,
    label: String,
    hint: String,
    value: String,
    onValueChange: (String) -> Unit,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    visualTransformation: VisualTransformation = VisualTransformation.None
) {

    Column(
        modifier = modifier
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.labelLarge
        )
        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            leadingIcon = leadingIcon,
            trailingIcon = trailingIcon,
            placeholder = {
                Text(text = hint)
            },
            visualTransformation = visualTransformation,
            modifier = Modifier.fillMaxWidth()
        )
    }
}


