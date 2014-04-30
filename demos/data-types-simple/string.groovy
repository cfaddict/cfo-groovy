/*
    Strings, G-Strings (*snickers*) and Groovy goodness
*/

//So what's a string?
println 'Hello World!'.class.name

//The base class has all the methods we've come to love from Java...
def myString = 'the quick brown fox'
println myString
println myString.capitalize()              //Capitalizes the first letter
println '!' + myString.center( 40 ) + '!'  //Pads the string to a minimum length
println myString.contains( 'fox' )         //Returns a boolean expression of whether a match is found
println myString.count( 'e' )              //Returns the number of occurances of the substring
println myString.findAll( /\w[uo]/ )       //Returns an array of matches

//The list goes on and on..... http://groovy.codehaus.org/groovy-jdk/java/lang/String.html

/*
    Now, Groovy let's us do some really neat stuff behind the scenes
    CHECK THIS OUT!!!
*/

println myString - 'fox' + 'monkey' //This is really cool

//However, that isn't working _quite_ how you expect
println myString - 'quick' + 'slow' //????

/*
    Ok? What gives?!?!?
    In this case Groovy has overwritten the 'minus' method of Java.Lang.String and supplied its own.
*/

//Groovy also supports regex syntax
println( /This is a regular expression ya'll/.class.name ) //Useful when you don't want to escape characters

//Multi-line strings
println """So, as you can see,
this is a multi-line string.

Pretty neat there. I can even "quote" things in a 'number' of ways."""  //NOTE: If I started the text on the line after the triple quotes, it would have added a new line

//We can loop through the string if we'd like even
myString.each { val ->
    println val
}

/*
    So, strings are pretty dynamic, how can it possibly get better?
    G-Strings
*/
println "$myString".class.name

//G-Strings allow us to include variables and evaluations as part of our strings. They must be encapsulated in double quotes.
println "The string is: $myString"

//We can use expressions
println "The string replaced with slow is: ${myString.replace( /quick/, 'slow')}"

/*
    So, there is a lot of power there. It's analogous to ColdFusions <cfoutput>##</cfoutput> format.
    However, there is a caveat. It is lazy loading.
*/

def bear = 'bear'
def ourStaticString = "The ${bear} ate my grandmother!" //This, upon initialization, will have a reference to what bear was when it was compiled.
bear = 'cat'
println ourStaticString

def cat = { -> bear } //Because the closure is a reference that is evaluated at runtime, it will have the correct value of bear as it is called when the string is displayed.
def ourDynamicString = "The ${cat} ate my grandfather!"
println ourDynamicString
bear = 'Rampaging Developer Way Past His Deadline'
println ourDynamicString