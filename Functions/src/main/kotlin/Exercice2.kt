var Produit = mutableListOf<String>()

fun Ajouter(){
    do {
        print("Enter le nom du nouveau produit: ")
        var nom = readLine()!!.toString()
        if (nom!="") Produit.add(nom)
    } while (nom == "")
}
fun Supprimer(){
    do {
        println("Entrer le nom du produit a supprimer: ")
        var delete = readLine()!!.toString()
        Produit.remove(delete)
    } while (delete == "")
}
fun Afficher(){
    println("list des produits : ")
    for(nom in Produit){
        println(nom)
    }
}

fun main() {
    println("Gestion des produits dans un store")

    var i = 0
    do {
        println("_______________Menu________________")
        println(" Tapper 1 pour ajouter un produit ")
        println(" Tapper 2 pour afficher tous les produit ")
        println(" Tapper 3 pour supprimer un produit ")
        println(" Tapper 4 pour sortir du programme ")
        println("_____________________________________")
        var value: Int = readLine()!!.toInt()

        when (value) {
            1 -> Ajouter()
            2 -> Afficher()
            3 -> Supprimer()
            4 -> break
            else -> {
                println("Veuillez choisir un nombre entre 1 à 4 ")
            }
        }
    }
    while (i==0)
}
