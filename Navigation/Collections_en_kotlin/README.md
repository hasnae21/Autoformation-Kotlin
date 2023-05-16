## Les Lists
	- les listes comportent de nombreuses fonctions intégrées
	- un autre type de collection en Kotlin est un *ensemble*
	- Les valeurs d'une *map* peuvent être des chaînes, des nombres ou des objets

### Function 
#### sorted() : renvoie une copie de la liste triée par ordre croissant
#### toSet() : pour convertir la liste en un ensemble, sans doublons
#### contains() : si un élément particulier se trouve ou non dans l'ensemble
#### intersect() ou union() : l'intersection (∩) ou l'union (∪) de deux ensembles
#### put() : Pour ajouter d'autres entrées à la map
#### forEach() :  passe en revue tous les éléments et effectue une opération sur chacun d'entre eux.
#### La fonction map() :  (à ne pas confondre avec une collection de map ou de dictionnaire ci-dessus) applique une transformation à chaque élément d'une collection
#### joinToString(", ") :  ajoute chaque élément de la collection transformée à une chaîne, séparée par ,
#### La fonction filter() :  renvoie les éléments d'une collection correspondant à une certaine expression.
#### La fonction startsWith() : renvoie la valeur "true" si une chaîne commence par la chaîne spécifiée
#### ignoreCase = true : pour ignorer la differance entre "b" et "B"
#### la fonction shuffled() pour créer une copie d'une collection avec les éléments mélangés aléatoirement
#### take(2) : pour obtenir les (2) premiers éléments de la collection


## Code test 

> 
fun main() {
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
    println("list:   ${numbers}")
    
    println("sorted list : ${numbers.sorted()}")
    
    val setOfNumbers = numbers.toSet()
	println("set:    ${setOfNumbers}")
    
    val set1 = setOf(1,2,3)
	val set2 = mutableSetOf(3,2,1)
    println("comparaison des ensembles: ${set1 == set2}")
    
    println("contains 7: ${setOfNumbers.contains(7)}")
    println("contains 0: ${setOfNumbers.contains(0)}")
    
    val peopleAges = mutableMapOf<String, Int>(
        "Fred" to 30,
        "Ann" to 23
    )

    peopleAges.put("Barbara", 42)
    peopleAges["Joe"] = 51
    peopleAges["Fred"] = 31
    println(peopleAges)
    
    peopleAges.forEach { print("${it.key} is ${it.value} years old, ") }
    println()
    println(peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", ") )
    
    val filteredNames = peopleAges.filter { it.key.length < 4 }
	println(filteredNames)

    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")
    val filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()
        .take(2)
        .sorted()
    println(filteredWords)
    
}



## Résumé

> Une collection est un groupe d'éléments associés

> Les collections peuvent être modifiables ou immuables

> Les collections peuvent être triées ou non triées

> Les collections peuvent nécessiter des éléments uniques ou inclure des doublons

> Kotlin accepte différents types de collections, y compris les *listes*, *les ensembles* et *les maps*

> Kotlin fournit de nombreuses fonctions pour le traitement et la transformation des collections, y compris *forEach*,*map*, *filter*, *sorted*, etc.

> *Un lambda* est une fonction sans nom pouvant être transmise immédiatement en tant qu'expression. Voici un exemple : { a: Int -> a * 3 }.

> *Une fonction* d'ordre supérieur permet de transmettre une fonction à une autre ou de renvoyer une fonction depuis une autre fonction.