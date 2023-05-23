# Les fragments et le composant Navigation


> *graphique de navigation* pour naviguer entre les fragments d'une même activité hôte

> __Un fragment__
: désigne simplement un élément réutilisable de l'interface utilisateur d'une application. Comme les activités, les fragments ont un cycle de vie et répondent aux entrées utilisateur.
: Chaque fragment gère son propre cycle de vie

https://developer.android.com/static/codelabs/basic-android-kotlin-training-fragments-navigation-component/img/8dc30a4c12ab71b_1440.png?hl=fr

> __NavHost__ : un élément NavHost permet d'afficher les destinations à partir d'un graphique de navigation au sein d'une activité. Lorsque vous naviguez entre des fragments, la destination affichée dans __NavHost__ est *mise à jour.*

> __NavController__ : l'objet NavController vous permet de contrôler la navigation entre les destinations affichées dans __NavHost__. Lorsque vous avez utilisé des intents, vous avez appelé la fonction __startActivity__ pour accéder à un nouvel écran. Avec le composant Navigation, vous pouvez appeler la méthode __navigate()__ de NavController pour permuter le fragment affiché. NavController vous aide également à gérer des tâches courantes, comme répondre au bouton "up" (haut) du système pour revenir au fragment précédemment affiché.