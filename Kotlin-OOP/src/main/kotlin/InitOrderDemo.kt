class InitOrderDemo(
    name: String
) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints $name")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

//class Customer(
// name: String
// ) {
//    val customerKey = name.uppercase()
//}

//class Customer public @Inject constructor(name: String){ /*...*/ }





//class Person constructor(firstName: String){ /*...*/ }

//class Person(
// val firstName: String,
// val lastName: String,
// var age: Int,
//var isEmployed: Boolean = true
// )