package com.akaiyukiusagi.kdocsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.akaiyukiusagi.kdocsample.ui.theme.KdocSampleTheme

/**
 * めいんあくてぃびぃてぃ〜
 *
 * 公式ドキュメント：https://github.com/Kotlin/dokka
 *
 * ```
 * ./gradlew dokkaHtml # htmlで出力
 * ./gradlew dokkaGfm # Markdownで出力
 * ```
 *
 * app/build/dokka に入っている
 *
 * @author ワイ
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KdocSampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    KdocSampleTheme {
        Greeting("Android")
    }
}