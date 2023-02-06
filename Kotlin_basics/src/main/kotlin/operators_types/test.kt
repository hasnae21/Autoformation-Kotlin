package operators_types

fun main(){
    var myString ="KOTLIN"
    println(myString[0])
    println(myString[1])
    println(myString.isEmpty())
    println(myString.length)
    println(myString.substring(2, 3))
    println("The string is $myString")

    val i: Int = 6
    val b1 = i.toByte()
    println(b1)

    val b2: Byte = 0 // OK, literals are checked statically
    println(b2)
}