import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import kotlinx.coroutines.delay

@Composable
fun MainWindow(viewModel: News) {
    var firstRender by remember { mutableStateOf(true) }

    if (viewModel.showWindow) {
        if (firstRender) {
            viewModel.startNews()
            viewModel.changeNews()
            firstRender = false
        }
        val coroutineScope = rememberCoroutineScope()
        LaunchedEffect(Unit) {
            while (true) {
                delay(5000)
                viewModel.changeNewsOne()
            }
        }
        Box(modifier = Modifier.fillMaxSize()) {
            // Здесь можно разместить другие элементы интерфейса
            Column( modifier = Modifier.fillMaxSize())
            {
                Row{
                    Box(modifier = Modifier.padding(all = 5.dp).clickable { viewModel.click1() }){

                        Box(){
                            Column(modifier = Modifier
                                .width(180.dp)
                                .clip(RoundedCornerShape(16.dp))

                                .padding(all = 5.dp)){

                                Text(text = viewModel.newsString1, modifier = Modifier.height(240.dp))
                                Row(modifier = Modifier.height(30.dp)) {
                                    Text(text = "лайки : ")
                                    Text(text = viewModel.likes1.toString())
                                }
                            }
                        }
                    }

                    Box(modifier = Modifier.padding(all = 5.dp).clickable { viewModel.click2() }){

                        Box(){
                            Column(modifier = Modifier
                                .width(180.dp)
                                .clip(RoundedCornerShape(16.dp))
                                .background(color = Color.White)
                                .padding(all = 5.dp)){

                                Text(text = viewModel.newsString2, modifier = Modifier.height(240.dp))
                                Row(modifier = Modifier.height(30.dp)) {
                                    Text(text = "лайки : ")
                                    Text(text = viewModel.likes2.toString())
                                }
                            }
                        }
                    }
                }
                Row{
                    Box(modifier = Modifier.padding(all = 5.dp).clickable { viewModel.click3() }){

                        Box(){
                            Column(modifier = Modifier
                                .width(180.dp)
                                .clip(RoundedCornerShape(16.dp))
                                .background(color = Color.White)
                                .padding(all = 5.dp)){

                                Text(text = viewModel.newsString3, modifier = Modifier.height(240.dp))
                                Row(modifier = Modifier.height(30.dp)) {
                                    Text(text = "лайки : ")
                                    Text(text = viewModel.likes3.toString())
                                }
                            }
                        }
                    }

                    Box(modifier = Modifier.padding(all = 5.dp).clickable { viewModel.click4() }){

                        Box(){
                            Column(modifier = Modifier
                                .width(180.dp)
                                .clip(RoundedCornerShape(16.dp)) // Устанавливаем радиус закругления
                                .background(color = Color.White)
                                .padding(all = 5.dp)){

                                Text(text = viewModel.newsString4, modifier = Modifier.height(240.dp))
                                Row(modifier = Modifier.height(30.dp)) {
                                    Text(text = "лайки : ")
                                    Text(text = viewModel.likes4.toString())
                                }
                            }
                        }
                    }
                }


            }
        }

    }
}