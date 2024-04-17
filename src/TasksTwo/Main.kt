package TasksTwo

import kotlin.random.Random
fun main() {
    println(weather(4, 15))
    println(weather(18, 25))
    println(weather(50, 5))
    println(weather(35, -15))
    println(weather(22, 31))
    println(random())
}

fun weather(age: Int, temperature: Int): String {
    return when {
        age < 6 || age > 60 -> "оставайтесь дома"
        temperature < -10 || temperature > 35 -> "оставайтесь дома"
        age < 18 && temperature > 30 -> "оставайтесь дома"
        else -> "идите гулять"
    }
}
fun random(): Int {
    return Random.nextInt(70)
}