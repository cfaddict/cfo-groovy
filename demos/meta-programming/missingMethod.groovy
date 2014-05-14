//*************************************************************************************************************
//Method Missing

class Foo {
    def methodMissing( String methodName, arguments ) {
        println "$methodName called with: $arguments"
    }
}

foo = new Foo()
foo.bar(a='test')




















//*************************************************************************************************************
//So, how is this useful?
class QA {
    String FirstName
    String LastName
    List<String> expertise = [ 'Bugs', 'Issues', 'Errors' ]
    
    def methodMissing( String methodName, arguments ) {
        if( methodName.startsWith( 'locate' ) || methodName.startsWith( 'gripeAbout' ) ) {
            def listVar = methodName.startsWith( 'locate' ) ? methodName[6..-1] : methodName[10..-1]
            QA instance = this //Groovy bug
            instance.metaClass."$methodName" = {-> 
                println listVar + ' ?' 
            }
            println "${methodName} has been added"
            this."$methodName"()
        } else {
            throw new MissingMethodException(methodName, this.class, arguments)
        }
    }
}

megan = new QA( firstName : 'Megan', lastName : 'Redacted' )
megan.with {
    locateBugs()
    gripeAboutIssues()
    locateErrors()
}
println ""
megan.with {
    locateBugs()
    gripeAboutIssues()
    locateErrors()
}

try{
    megan.eatOnions()
} catch( e ) {
    println "The error: $e"
}