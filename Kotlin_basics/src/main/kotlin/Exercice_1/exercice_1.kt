fun main() {
    println("Entrer le nombre de ligne voulu : ")
    val nbr_enter = Integer.valueOf(readLine())
    println("vous avez entrer $nbr_enter")

    for (i in 1..nbr_enter) {
        for (j in 1..nbr_enter - i) {
            print(" ")
        }
        print("_")
        for (j in 1..(2 * i - 1)) {
            print("*")
        }
        print("_")
        println()
    }

}
