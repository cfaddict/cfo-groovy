/*
    The DEF keyword
    what is it?
    what does it do?
    can it file my taxes, because I am waaaaaaaaaaaaay late on that one?
*/

/* 
    Groovy autowires variable types upon creation if it isn't explicitly typed
    This is part of the whole 'dynamic language' thing
*/

a = 10
println a.class.name

def b = 10
println b.class.name

// So what is DEF doing for us then?


// Well, for starters, it helps puts things into scope
foo = 'Joshua'
def bar = 'Caito' //This is locally scoped

public test() {
    def someVar = 'hey there!'
    someOtherVar = 'ho there!'
    assert 'Joshua' == foo
    try {
        assert 'Caito' == bar //Not in scope for the function
    } catch( e ) {
        println "whoopsie-doodle! Look at this: $e"
    }
}

test()

try{
    println someVar //Scoped locally to the class
} catch ( e ) {
    println e
}

println someOtherVar //Globally scoped

/*
    DEF _really_ only has that much of a scoping affect in scripts. In class definitions, etc... you generally can't globally scope things
*/

//DEF also allows us to bypass strict typing
int x = 10
def y = 10

println x.class.name
println y.class.name

try {
    x = 'this will not work'
} catch( e ) {
    println e
}

y = 'this will work'
println y

/*
    So Groovy will let us override the type definiton as long as we use the DEF keyword
*/
