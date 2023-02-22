package variables

const val BEST_PROGRAMMING_LANGUAGE = "Kotlin"

fun main() {

    var hello = "Hello"
    hello = "Hello world!"

    println(hello)

    var toto:String = "Toto"

    println(toto)

    var message: String? = "I’m learning Kotlin!"
    message = null
    message = "30"
    println(message?.toString())

}