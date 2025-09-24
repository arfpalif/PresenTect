package com.education.presentech

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.education.presentech.ui.theme.PresentechTheme
import com.education.presentech.ui.theme.bluePrimary
import com.education.presentech.ui.theme.blueSecondary

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PresentechTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Card(
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier.padding(20.dp)
    ) {
        val brush = Brush.horizontalGradient(listOf(bluePrimary, blueSecondary))
        Box(
            modifier = Modifier
                .background(brush)
                .padding(8.dp)
        ) {
            CompositionLocalProvider(LocalContentColor provides Color.White) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    /*Image(
                        *//*painter = painterResource(R.drawable.jetpack_compose)*//*
                        contentDescription = "Logo jetpack",
                        *//*modifier = Modifier.size(animatedSizeDp)*//*
                    )*/
                    Spacer(Modifier.width(10.dp))
                    Column(Modifier.weight(1f)) {
                        Text(
                            text = "Hello, $name!",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = "Welcome to dicoding")
                    }
                    IconButton(onClick = {}) {
                        /*Icon(
                            imageVector = Icons.Filled.ExpandLess else Icons.Outlined.ExpandMore,
                            contentDescription = if (isExpanded) "Show less" else "Show more"
                        )*/
                    }
                }
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PresentechTheme {
        Greeting("Android")
    }
}