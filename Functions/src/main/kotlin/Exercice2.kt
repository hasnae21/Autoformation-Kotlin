var Produit = mutableListOf<String>()
fun main() {
    println("Gestion des produits dans un store")

    var i = 0
    while (i <4) {
        println("_______________________")
        println(" Tapper 1 pour ajouter un Produit ")
        println(" Tapper 2 pour afficher un Produit ")
        println(" Tapper 3 pour supprimer un Produit ")
        println(" Tapper 4 pour sortir du programme ")
        println("_______________________")


        var value = readLine()!!.toInt()

        when (value) {
            1 -> Ajouter()
            2 -> Afficher()
            3 -> Supprimer()
            4 -> break
            else -> {
                println("Le nombre n'est pas existé,choisie num 1 à 4 ")
            }
        }
    }
}
fun Ajouter(){
    print("Enter le nom du nouveau produit: ")
    var nom= readLine()!!.toString()
    Produit.add(nom)
}
fun Supprimer(){
    println("Entrer le nom du produit a supprimer: ")
    var delete = readLine()!!.toString()
    Produit.remove(delete)
}
fun Afficher(){
    println("list des produits : ")
    for(nom in Produit){
        println(nom)
    }
}
