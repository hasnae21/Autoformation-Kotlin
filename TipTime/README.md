> You will be using these UI elements that are provided by Android:
### EditText - for entering and editing text
### TextView - to display text like the service question and tip amount
### RadioButton - a selectable radio button for each tip option
### RadioGroup - to group the radio button options
### Switch - an on/off toggle for choosing whether to round up the tip or not
### RecyclerView

https://developer.android.com/static/codelabs/basic-android-kotlin-training-xml-layouts/img/8dea708333aebabe_960.png


> <!-- this is a comment in XML -->
<!-- this is a
multi-line 
Comment.
And another
Multi-line comment -->

> This indicates that the file is an XML file, but not every XML file includes this.  
<?xml version="1.0" encoding="utf-8"?>

> // Old way with findViewById()
val myButton: Button = findViewById(R.id.my_button)
myButton.text = "A button"
// Better way with view binding
val myButton: Button = binding.myButton
myButton.text = "A button"
// Best way with view binding and no extra variable
binding.myButton.text = "A button"


# Summary
> XML (Extensible Markup Language) is a way of organizing text, made of tags, elements, and attributes.
> Use XML to define the layout of an Android app.
> Use EditText to let the user input or edit text.
> An EditText can have a hint to tell the user what is expected in that field.
> Specify the android:inputType attribute to limit what type of text the user can input into an EditText field.
> Make a list of exclusive options with RadioButtons, grouped with a RadioGroup.
> A RadioGroup can be vertical or horizontal, and you can specify which RadioButton should be selected initially.
> Use a Switch to let the user toggle between two options.
> You can add a label to a Switch without using a separate TextView.
> Each child of a ConstraintLayout needs to have vertical and horizontal constraints.
> Use "start" and "end" constraints to handle both Left to Right (LTR) and Right to Left (RTL) languages.
> Names of the constraint attributes follow the form layout_constraint<Source>_to<Target>Of.
> To make a View as wide as the ConstraintLayout it's in, constrain the start and end to the start and end of the parent, and set the width to 0dp.

> View binding lets you more easily write code that interacts with the UI elements in your app.
> The Double data type in Kotlin can store a decimal number.
> Use the checkedRadioButtonId attribute of a RadioGroup to find which RadioButton is selected.
> Use NumberFormat.getCurrencyInstance() to get a formatter to use for formatting numbers as currency.
> You can use string parameters like %s to create dynamic strings that can still be easily translated into other languages.
> Testing is important!
> You can use Logcat in Android Studio to troubleshoot problems like the app crashing.
> A stack trace shows a list of methods that were called. This can be useful if the code generates an exception.
> Exceptions indicate a problem that code didn't expect.
> Null means "no value."
> Not all code can handle null values, so be careful using it.
> Use Analyze > Inspect Code for suggestions to improve your code.