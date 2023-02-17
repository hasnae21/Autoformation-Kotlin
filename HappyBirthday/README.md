// 
> Ajouter un Button à une application Android
> Ajouter un comportement déclenché lorsque l'utilisateur appuie sur un Button dans l'application
> Ouvrir et modifier le code Activity d'une application
> Comment afficher un message Toast
> Mettre à jour le contenu d'un TextView pendant l'exécution de l'application


// Solution:
>> Ajoutez un élément Button dans une application Android à l'aide de l'éditeur de mise en page.
>> Modifiez la classe MainActivity.kt pour ajouter un comportement interactif à l'application.
>> Affichez un message Toast comme solution temporaire pour vérifier que vous êtes sur la bonne voie.
>> Définissez un écouteur de clics pour un Button à l'aide de setOnClickListener() afin d'ajouter le comportement associé à un clic sur un Button.
>> Lorsque l'application est en cours d'exécution, vous pouvez mettre à jour ce qui s'affiche à l'écran en appelant des méthodes sur TextView, Button ou d'autres éléments d'UI dans la mise en page.
>> Commentez votre code pour aider les personnes qui le liront à comprendre votre approche.
Reformatez votre code et nettoyez-le.


import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

   override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)

       val rollButton: Button = findViewById(R.id.button)
       rollButton.setOnClickListener {
           val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
           toast.show()       }
   }
}

class MainActivity : AppCompatActivity() {

   override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)

       val rollButton: Button = findViewById(R.id.button)
       rollButton.setOnClickListener {
        Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
        
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = "6"
       }
   }
}

class Dice(val numSides: Int) {

   fun roll(): Int {
       return (1..numSides).random()
   }
}