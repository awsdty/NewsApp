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

    fun startNews(){
        likesArray = Array(newsArray.size) {0}


    }

    fun changeNews(){
        likesArray?.set(id1, _likes1.value ?: 0)
        likesArray?.set(id2, _likes2.value ?: 0)
        likesArray?.set(id3, _likes3.value ?: 0)
        likesArray?.set(id4, _likes4.value ?: 0)
        id1 = generateRandomNumber(newsArray.size, id1, id2, id3, id4)
        id2 = generateRandomNumber(newsArray.size, id1, id2, id3, id4)
        id3 = generateRandomNumber(newsArray.size, id1, id2, id3, id4)
        id4 = generateRandomNumber(newsArray.size, id1, id2, id3, id4)
        _likes1.value = likesArray?.get(id1) ?: 0
        _likes2.value = likesArray?.get(id2) ?: 0
        _likes3.value = likesArray?.get(id3) ?: 0
        _likes4.value = likesArray?.get(id4) ?: 0
        newsString1 = newsArray[id1]
        newsString2 = newsArray[id2]
        newsString3 = newsArray[id3]
        newsString4 = newsArray[id4]
    }


    fun changeNewsOne() {
        // Выбираем случайный айди
        val randomPost = generateRandomNumber(4, 5, 5, 5, 5)
        val randomId = generateRandomNumber(newsArray.size, id1, id2, id3, id4)
        println(randomId)
        // Обновляем данные только для этого айди
        when (randomPost) {
            0 -> {
                likesArray?.set(id1, _likes1.value ?: 0)
                _likes1.value = likesArray?.get(randomId) ?: 0
                newsString1 = newsArray[randomId]
            }
            1 -> {
                likesArray?.set(id2, _likes2.value ?: 0)
                _likes2.value = likesArray?.get(randomId) ?: 0
                newsString2 = newsArray[randomId]
            }
            2 -> {
                likesArray?.set(id3, _likes3.value ?: 0)
                _likes3.value = likesArray?.get(randomId) ?: 0
                newsString3 = newsArray[randomId]
            }
            3 -> {
                likesArray?.set(id4, _likes4.value ?: 0)
                _likes4.value = likesArray?.get(randomId) ?: 0
                newsString4 = newsArray[randomId]
            }
        }
    }

    fun generateRandomNumber(N: Int, a: Int, b: Int, c: Int, d: Int): Int {
        val excludedNumbers = setOf(a, b, c, d)
        var randomNumber: Int

        do {
            randomNumber = Random.nextInt(N)
        } while (randomNumber in excludedNumbers)

        return randomNumber
    }

    fun click1() {

        _likes1.value = (_likes1.value ?: 0) + 1
    }
    fun click2(){
        _likes2.value = (_likes2.value ?: 0) + 1
    }
    fun click3(){
        _likes3.value = (_likes3.value ?: 0) + 1
    }
    fun click4(){
        _likes4.value = (_likes4.value ?: 0) + 1
    }


}