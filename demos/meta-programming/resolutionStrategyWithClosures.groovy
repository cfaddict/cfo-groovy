//*************************************************************************************************************
//Resolution Strategy with the MOP

class Foo {
    def say( String thingToSay ){
        println "I said: ${thingToSay}"
    }
    
    def doStuff() {
        def ourClosure = {
            say 'hi!'
            say 'bye!'
        }
        
        def bar = new Bar()
        
        ourClosure.delegate = bar
        //ourClosure.resolveStrategy = Closure.DELEGATE_FIRST
        ourClosure()
        println ourClosure.owner.class.name
    }    
}

class Bar {
    def say( String thingToSay ) {
        println "I won't say ${thingToSay}"
    }
}

foo = new Foo()
foo.doStuff()