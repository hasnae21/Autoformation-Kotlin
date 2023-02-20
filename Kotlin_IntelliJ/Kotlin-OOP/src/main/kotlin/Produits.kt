interface IGestion {
    fun Ajouter()
    fun Supprimer()
    fun Afficher()
}
class GestionProduits(): IGestion{
    val Table = mutableListOf<String>()
    override fun Afficher() {
        println(Table)
    }
    override fun Ajouter() {
        println("Ajouter un produit")
        var value: String = readLine()!!.toString()
        Table.add(value)
    }
    override fun Supprimer() {
        println("Supprimer un produit")
        var value: String = readLine()!!.toString()
        Table.remove(value)
    }


}


//
//class Produit(
//    var name: String,
//    var prix: Int
//){
//
//    init {
//        println("le nom du produit est $name")
//        println("le prix du produit est $prix")
//    }
//
//}
