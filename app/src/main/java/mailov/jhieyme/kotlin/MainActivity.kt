package mailov.jhieyme.kotlin

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import mailov.jhieyme.kotlin.ui.theme.JhieymeTheme
import mailov.jhieyme.kotlin.ui.theme.Pink80
import mailov.jhieyme.kotlin.ui.theme.Purple80

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      mensajeNombre("Jhieyme")
    }
  }


  @Composable
  fun mensajeNombre(nombre: String) {
    Text(text = "Probando esto jsjs $nombre")
  }
}



