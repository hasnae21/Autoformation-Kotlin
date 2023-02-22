# Summary
> To create new Kotlin source files in IntelliJ IDEA, click on "src" in the Project pane and right-click to bring up a menu. Select "New->Kotlin File/Class".

> To compile and run a program in IntelliJ IDEA, click the green triangle next to the main() function. Output appears in a window below.

> In IntelliJ IDEA, specify command line arguments to pass to the main() function in Run > Edit Configurations.

> Almost everything in Kotlin has a value. You can use this fact to make your code more concise by using the value of an if or when as an expression or return value.

> Default arguments remove the need for multiple versions of a function or method. For example: fun swim(speed: String = "fast") { ... }

> Compact functions, or single-expression functions, can make your code more readable. For example: fun isTooHot(temperature: Int) = temperature > 30

> You've learned some basics about filters, which use lambda expressions. For example: val beginsWithP = decorations.filter { it [0] == 'p' }

> A lambda expression is a function that is not bound to an identifier, i.e. it is an anonymous function. Lambda expressions are defined between curly braces {}.

> In a higher-order function, you pass a function such as a lambda expression to another function as data. For example: dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}


### Note: You may have noticed that in Kotlin, as in some other languages, there is more than one correct way to do things. Making code more compact sometimes helps readability and performance, but sometimes it doesn't. As you learn more about Kotlin, you may find easier, more concise ways to do things.