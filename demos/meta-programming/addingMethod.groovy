//*************************************************************************************************************
//Adding a method

class Developer { 
    String firstName, lastName
    def makeExcuse(){ 
        println "I'm compiling!" 
    }
}

josh = new Developer( firstName : 'Joshua', lastName : 'Caito' )

Developer.metaClass.work = { Integer hours ->
    println """I promise I'll work ${hours} hours today
    or my name isn't ${firstName} ${lastName}!"""
}

dan = new Developer( firstName : 'Dan', lastName : 'Vega' )

try{ 
    josh.work(3) 
} catch( e ) { 
    josh.makeExcuse() 
}
dan.work(8)  