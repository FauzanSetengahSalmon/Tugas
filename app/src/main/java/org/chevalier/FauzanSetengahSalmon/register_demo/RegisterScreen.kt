package org.chevalier.FauzanSetengahSalmon.register_demo

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.chevalier.FauzanSetengahSalmon.components.CustomTextField
import org.chevalier.FauzanSetengahSalmon.ui.theme.Tugas2Theme
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.lint.kotlin.metadata.Visibility

@Composable
fun RegisterScreen(modifier: Modifier = Modifier) {

    var username by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }
    var passwordVisible by rememberSaveable { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 0.dp)
        ) {
            Text(
                text = "Register",
                fontSize = 24.sp
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Daftar menggunakan username, email dan password anda."
        )
        Spacer(modifier = Modifier.height(16.dp))
        CustomTextField(
            modifier = Modifier.fillMaxWidth(),
            label = "Username",
            hint = "Buat Username",
            value = username,
            onValueChange = { text ->
                username = text
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Username"
                )
            },
            trailingIcon = {

            },
            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation()
        )

        Spacer(modifier = Modifier.height(8.dp))
        CustomTextField(
            modifier = Modifier.fillMaxWidth(),
            label = "Email",
            hint = "Masukkan Email",
            value = email,
            onValueChange = { text ->
                email = text
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Email"
                )
            },
            trailingIcon = {

            },
            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation()
        )
        Spacer(modifier = Modifier.height(8.dp))
        CustomTextField(
            modifier = Modifier.fillMaxWidth(),
            label = "Password",
            hint = "Masukkan password anda",
            value = password,
            onValueChange = { text ->
                password = text
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "Password"
                )
            },
            trailingIcon = {
                IconButton(onClick = { passwordVisible = !passwordVisible }) {
                    Icon(
                        imageVector = if (passwordVisible) Icons.Default.Visibility else Icons.Default.VisibilityOff,
                        contentDescription = if (passwordVisible) "Hide password" else "Show password"
                    )
                }
            },
            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = androidx.compose.ui.graphics.Color(0xFFBB86FC))
        ) {
            Text(text = "Register")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RegisterScreenPreview() {
    Tugas2Theme {
        RegisterScreen()
    }
}
