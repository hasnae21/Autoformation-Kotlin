https://developer.android.com/static/codelabs/basic-android-kotlin-training-activity-lifecycle/img/c803811f4cb4034b_1440.png?hl=fr

https://developer.android.com/static/codelabs/basic-android-kotlin-training-activity-lifecycle/img/f6b25a71cec4e401_1440.png?hl=fr

### La classe __Log__ écrit les messages dans l'outil __Logcat__. 
### Logcat est la console de journalisation des messages. C'est là que les messages Android concernant votre application s'affichent

#### Log.d() écrit un message de débogage
#### Log.i() pour les messages d'information
#### Log.e() pour les erreurs
#### Log.w() pour les avertissements
#### Log.v() pour les messages détaillés

#### onSaveInstanceState() est un rappel qui permet d'enregistrer les données dont vous pourriez avoir besoin si l'activité (Activity) était éliminée

> import android.util.Log
> const val TAG = "MainActivity"

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate()
    Log.d(TAG, "onCreate Called")
}

override fun onStart() {
   super.onStart()
   Log.d(TAG, "onStart Called")
}

override fun onResume() {
   super.onResume()
   Log.d(TAG, "onResume Called")
}

override fun onPause() {
   super.onPause()
   Log.d(TAG, "onPause Called")
}

override fun onStop() {
   super.onStop()
   Log.d(TAG, "onStop Called")
}

override fun onDestroy() {
   super.onDestroy()
   Log.d(TAG, "onDestroy Called")
}

override fun onRestart() {
   super.onRestart()
   Log.d(TAG, "onRestart Called")
}


### Perte de données lors de la rotation de l'appareil

override fun onSaveInstanceState(outState: Bundle) {
   super.onSaveInstanceState(outState)

   Log.d(TAG, "onSaveInstanceState Called")
}


# Résumé

## Cycle de vie de l'activité
- Le cycle de vie de l'activité correspond à un ensemble d'états par lesquels passe une activité. Il commence lorsque l'activité est créée pour la première fois et se termine lorsque l'activité est éliminée.
- Lorsque l'utilisateur passe d'une activité à l'autre et de votre application à une autre, l'état change dans le cycle de vie de l'activité.
Chaque état du cycle de vie de l'activité possède une méthode de rappel correspondante que vous pouvez remplacer dans la classe Activity. Les principales méthodes de cycle de vie sont les suivantes : 
   - onCreate()onStart()onPause()onRestart()onResume()onStop()onDestroy()
   - Pour ajouter le comportement qui se produit lorsque votre activité passe à un état du cycle de vie, remplacez la méthode de rappel de correspondante.
- Pour ajouter des méthodes de remplacement à vos classes dans Android Studio, sélectionnez Code > Remplacer les méthodes ou appuyez sur Control+o.

## Conserver l'état de l'activité
Lorsque votre application passe en arrière-plan, juste après l'appel de la méthode __onStop()__, les données de l'application peuvent être enregistrées dans un bundle. Certaines données de l'application, telles que le contenu d'un élément EditText, sont automatiquement enregistrées.
Le bundle est une instance de Bundle, qui correspond à un ensemble de clés et de valeurs. Les clés sont toujours des chaînes.
Utilisez le rappel __onSaveInstanceState()__ pour enregistrer d'autres données dans le bundle que vous souhaitez conserver, même si l'application a été fermée automatiquement. 

- Pour placer des données dans le bundle, utilisez les méthodes correspondantes commençant par put, telles que __*putInt()*__
- Pour récupérer des données du bundle avec une clé, utilisez les méthodes Bundle commençant par get, par exemple __*getInt()*__

## Modifications de la configuration
> Quand Android arrête une application en raison d'une modification de la configuration, il redémarre l'activité avec le bundle d'état disponible pour onCreate().
Comme pour l'arrêt d'un processus, enregistrez l'état de votre application dans le bundle dans onSaveInstanceState()