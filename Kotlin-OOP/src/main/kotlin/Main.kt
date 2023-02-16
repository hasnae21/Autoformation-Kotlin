fun main(args: Array<String>) {
    println("Hello World!")
    val dog = Dog()
    val demo = InitOrderDemo("Hasnae")


    val Produits = GestionProduits()
    val i:Int = 0
    while ( i < 5) {
        println("gestion des produits")
        println("1.Ajouter")
        println("2.Afficher")
        println("3.Supprimer")
        println("4.Sortie")
        print("Choisie un nombre : ")
        var number: Int = readLine()!!.toInt()
        when (number) {
            1 -> Produits.Ajouter()
            2 -> Produits.Afficher()
            3 -> Produits.Supprimer()
            4 -> break
        }
    }

}

//fun product() {
//    val product = Produit()
//}
//
//fun main() {
//
//    product()
//}