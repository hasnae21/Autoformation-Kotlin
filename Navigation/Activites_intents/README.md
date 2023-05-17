Il existe deux types d'intents : 
implicite et explicite.

#### Un intent *__explicite__* permet d'effectuer des actions ou de présenter des écrans dans votre propre application. Vous êtes responsable de l'ensemble du processus. 
#### Les intents *__implicites__* sont couramment utilisés pour réaliser des actions impliquant d'autres applications. Dans ce cas, c'est le système qui détermine le résultat final. Vous utiliserez les deux types d'intents dans l'application Words.


### Functions

> putExtra() :  Un extra est une donnée, tel qu'un nombre ou une chaîne, à laquelle un nom à récupérer ultérieurement est attribué. Il s'apparente à la transmission d'un argument lorsque vous appelez une fonction.

> la propriété __intent__ ? Il ne s'agit pas d'une propriété DetailActivity, mais plutôt d'une propriété correspondant à n'importe quelle activité. Elle conserve une référence à l'intent utilisé pour lancer l'activité.

> La propriété __extras__ est de type Bundle, permet d'accéder à tous les extras transmis à l'intent

> les propriétés intent et extras peuvent être nullables

## Résumé

> Les intents explicites permettent d'accéder à des activités spécifiques dans votre application.

> Les intents implicites correspondent à des actions spécifiques (comme ouvrir un lien ou partager une image) et laissent le système déterminer comment les traiter.

> Les options de menu vous permettent d'ajouter des boutons et des menus à la barre d'application.

> Les objets compagnons permettent d'associer des constantes réutilisables à un type plutôt qu'une instance de ce type.

- Pour exécuter un intent :

> - Effectuez une référence au contexte.

> - Créez un objet Intent qui fournit un type d'activité ou d'intent (selon qu'il est explicite ou implicite).

> - Transmettez toutes les données nécessaires en appelant putExtra().

> - Appelez startActivity() en transmettant l'objet intent.