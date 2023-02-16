class Produit(
    val name: String,
    val prix: Int,
){

    init {
        println("le nom du produit est $name")
        println("le prix du produit est $prix")
    }

}