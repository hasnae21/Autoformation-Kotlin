# Les fragments et le composant Navigation

> *graphique de navigation* pour naviguer entre les fragments d'une même activité hôte

> __Un fragment__
: désigne simplement un élément réutilisable de l'interface utilisateur d'une application. Comme les activités, les fragments ont un cycle de vie et répondent aux entrées utilisateur.
: Chaque fragment gère son propre cycle de vie

https://developer.android.com/static/codelabs/basic-android-kotlin-training-fragments-navigation-component/img/8dc30a4c12ab71b_1440.png?hl=fr

> __NavHost__ : un élément NavHost permet d'afficher les destinations à partir d'un graphique de navigation au sein d'une activité. Lorsque vous naviguez entre des fragments, la destination affichée dans __NavHost__ est *mise à jour.*

> __NavController__ : l'objet NavController vous permet de contrôler la navigation entre les destinations affichées dans __NavHost__. Lorsque vous avez utilisé des intents, vous avez appelé la fonction __startActivity__ pour accéder à un nouvel écran. Avec le composant Navigation, vous pouvez appeler la méthode __navigate()__ de NavController pour permuter le fragment affiché. NavController vous aide également à gérer des tâches courantes, comme répondre au bouton "up" (haut) du système pour revenir au fragment précédemment affiché.

> Le graphique de navigation (ou __NavGraph__): est un mappage virtuel de la navigation dans votre application. Chaque écran ou, dans votre cas, *chaque fragment*, deviendra une *"destination"* à laquelle il sera possible d'accéder. Un *NavGraph peut être représenté par un fichier XML qui montre comment les destinations sont liées*.

> La fonction actionLetterListFragmentToWordListFragment()
: est l'action spécifique permettant d'accéder à wordListFragment.

# Résumé

- Les fragments sont des éléments d'interface utilisateur réutilisables qui peuvent être intégrés dans des activités.

- Le cycle de vie d'un fragment diffère du cycle de vie d'une activité, car la configuration de la vue s'effectue dans *onViewCreated()* et non dans *onCreateView()*.

- Un élément *FragmentContainerView* permet d'intégrer des fragments dans d'autres activités et de gérer la navigation entre eux.

### Fonctionnement du composant de navigation

- La définition de l'attribut navGraph d'un élément FragmentContainerView vous permet de naviguer entre les fragments d'une activité.

- L'éditeur NavGraph vous permet d'ajouter des actions de navigation et de spécifier des arguments entre différentes destinations.

- Bien que la navigation à l'aide d'intents nécessite la transmission d'éléments supplémentaires, le composant Navigation utilise SafeArgs pour générer automatiquement des classes et des méthodes pour vos actions de navigation, ce qui garantit la sécurité des types avec des arguments.

### Cas d'utilisation des fragments

- Grâce au composant Navigation, de nombreuses applications peuvent gérer l'ensemble de leur mise en page au sein d'une même activité, la navigation se faisant entre les fragments.

- Les fragments permettent des modèles de mise en page courants, tels que les mises en page maître/détail sur les tablettes ou plusieurs onglets dans la même activité.