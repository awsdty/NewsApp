import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import kotlin.random.Random

class News : ViewModel() {
    var showWindow by mutableStateOf(true)
        private set
    var newsString1 = ""
    var newsString2 = ""
    var newsString3 = ""
    var newsString4 = ""
    private val _likes1 = mutableIntStateOf(0)
    val likes1 by _likes1
    private val _likes2 = mutableIntStateOf(0)
    val likes2 by _likes2
    private val _likes3 = mutableIntStateOf(0)
    val likes3 by _likes3
    private val _likes4 = mutableIntStateOf(0)
    val likes4 by _likes4
    var id1 = 0
    var id2 = 0
    var id3 = 0
    var id4 = 0

    var likesArray : Array<Int?>? = null
    var newsArray: Array<String> = arrayOf(
        "В мире произошло важное событие, связанное с изменением климата.",
        "Ученые нашли новый способ лечения редкого заболевания.",
        "Глобальные компании запускают инициативы по защите окружающей среды.",
        "Состоялся международный форум по вопросам образования и науки.",
        "Эксперты прогнозируют рост экономики в следующем году.",
        "Новые технологии помогают в борьбе с бедностью.",
        "Исследования показывают, что активный образ жизни улучшает здоровье.",
        "Ведущие страны мира подписали соглашение о сотрудничестве в области науки.",
        "Культурные мероприятия привлекают внимание молодежи.",
        "Социальные сети становятся важным инструментом для активизма."
    )

    


}