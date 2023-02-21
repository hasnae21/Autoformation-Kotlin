> You will be using these UI elements that are provided by Android:
### EditText - for entering and editing text
### TextView - to display text like the service question and tip amount
### RadioButton - a selectable radio button for each tip option
### RadioGroup - to group the radio button options
### Switch - an on/off toggle for choosing whether to round up the tip or not

https://developer.android.com/static/codelabs/basic-android-kotlin-training-xml-layouts/img/8dea708333aebabe_960.png


> <!-- this is a comment in XML -->
<!-- this is a
multi-line 
Comment.
And another
Multi-line comment -->

> This indicates that the file is an XML file, but not every XML file includes this.  
<?xml version="1.0" encoding="utf-8"?>


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