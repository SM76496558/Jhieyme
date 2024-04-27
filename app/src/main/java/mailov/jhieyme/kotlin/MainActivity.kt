package mailov.jhieyme.kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import mailov.jhieyme.kotlin.ui.theme.JhieymeTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      mensajeNombre()
    }
  }
}

@Preview(showBackground = true)
@Composable
fun mensajeNombre() {

  Text(text = "Aqui arranca nuestra aventura Jhieyme")

}
