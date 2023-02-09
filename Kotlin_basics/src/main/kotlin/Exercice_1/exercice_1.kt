fun main() {
    print("Entrer le nombre de ligne voulu: ")

    val nbr_enter = readLine()!!.toInt()
    println("vous avez entrer $nbr_enter")

    for (i in 1..nbr_enter) {
        for (j in 1..nbr_enter - i) {
            print(" ")
        }
        for (j in 1..(2 * i - 1)) {
            print("*")
        }
        println()
    }
}
