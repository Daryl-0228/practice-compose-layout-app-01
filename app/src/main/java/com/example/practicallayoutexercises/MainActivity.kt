package com.example.practicallayoutexercises

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicallayoutexercises.ui.theme.PracticalLayoutExercisesTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      PracticalLayoutExercisesTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
          ComposeArticleApp()
        }
      }
    }
  }
}

@Composable
fun ComposeArticleApp() {
  ArticleItem(
    title = stringResource(R.string.TitleText),
    subTitle = stringResource(R.string.SubTitleText),
    description = stringResource(R.string.DescriptionText),
    imagePainter = painterResource(R.drawable.bg_compose_background)
  )
}

@Composable
fun ArticleItem(title: String, subTitle: String, description: String, imagePainter: Painter, modifier: Modifier = Modifier) {
  Column(modifier = modifier) {
    Image(painter = imagePainter, contentDescription = null, contentScale = ContentScale.FillWidth)
    Text(text = title, fontSize = 24.sp, modifier = Modifier.padding(16.dp))
    Text(text = subTitle, textAlign = TextAlign.Justify, modifier = Modifier.padding(horizontal = 16.dp))
    Text(text = description, textAlign = TextAlign.Justify, modifier = Modifier.padding(16.dp))
  }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  PracticalLayoutExercisesTheme {
    ComposeArticleApp()
  }
}