class QA {
    String FirstName
    String LastName
    List<String> expertise = [ 'Bugs', 'Issues', 'Errors' ]
    
    QA() {
        def mClass = new ExpandoMetaClass( QA, false, true ) //Add object, do not register, allow changes after init
        mClass.initialize()
        this.metaClass = mClass
    }
    
    def methodMissing( String methodName, arguments ) {
        if( methodName.startsWith( 'locate' ) || methodName.startsWith( 'gripeAbout' ) ) {
            def listVar = methodName.startsWith( 'locate' ) ? methodName[6..-1] : methodName[10..-1]
            this.metaClass."$methodName" = {-> 
                println listVar + ' ?' 
            }
            println "${methodName} has been added"
            this."$methodName"()
        } else {
            throw new MissingMethodException(methodName, this.class, arguments)
        }
    }
    
    def invokeMethod( String methodName, arguments ){
        println "$methodName was invoked"
        this."$methodName"(arguments)
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

