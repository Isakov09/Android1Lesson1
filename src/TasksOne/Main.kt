package TasksOne

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {

    var carName: String
    val NUM: Int = 1990
    val word: String = "Doge Challenger"
    val result: String = NUM.toString() + word
    println(result)

    val message = if (NUM < 0) {
        "Вы сохранили отрицательное число"
    } else if (NUM > 0) {
        "Вы сохранили положительное число"
    } else {
        "Вы сохранили нуль"
    }
    println(message)
}