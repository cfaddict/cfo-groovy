//Operators

//Groovy provides us some really cool operators!

//*************************************************************************************************************
//The ELVIS operator ?:

//The Hard way:
def a = 10
def b

b = a == 10 ? a : false
println b

//The Groovy way:
a = 20
b = a == 10?: false //just reduces on typing, but useful!

println b //should be false





//*************************************************************************************************************
//The SPREAD operator *.

class Foo {
    char name
    def sayMyName(){
        print name
    }
}

c = new Foo( name:'c' )
d = new Foo( name:'d' )
e = new Foo( name:'e' )
def f = [ c, d, e ]

//The Hard way:
for( item in f ) {
    item.sayMyName()
}

println ''

//The Groovy way:
f*.sayMyName() //Much nicer!





//*************************************************************************************************************
//The SAFE NAVIGATION operator ?.

class Bar {
    def myProp
}

def myBar = new Bar()

//The Hard way:
def result = myBar.myProp ?: null

try {
    println result.myProp
} catch( e ) {
    println 'whoopsie-doodle!'
}

//The Groovy way:
println result?.myProp //No error!





//*************************************************************************************************************
//The SPACESHIP operator <=>

//The Hard way:
def g = 2
def h = 1
def i = g < h ? -1 : g == h ? 0 : 1 //Ugh. That's messy
println i 

//The Groovy way:
i = g <=> h //WOOT!
println i





//*************************************************************************************************************
//The REGULAR EXPRESSION operators =~ find ==~ match

//I'm not even going to cover Hard here. It's a pain.

//The MATCH operator

ourString = 'Dan Vega is really into crossfit'
assert ourString =~ /i/ //True

println "${(ourString =~ /crossfit/).replaceFirst( 'P90X' )}"

(ourString =~ /a/).each{
    println 'h' + it + 'h' //It's a joke Dan ^_^
}





//*************************************************************************************************************
//For some great reading, see: http://docs.codehaus.org/display/GROOVY/Regular+Expressions

//The FIND operator
ourString = 'Dan Vega is really into crossfit'

println "${(ourString ==~ /crossfit/)}" //looks for an _exact_ match

println "${(ourString ==~ /[\w\s].*/)}" //This will work





//*************************************************************************************************************
//The METHOD reference operator .*

class Reference {
    def groovyRocks() {
        println "Groovy Rocks!"
    }
}

def gr = new Reference()
println gr.&groovyRocks //This will come into play in hour 2!
