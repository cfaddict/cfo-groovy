//*************************************************************************************************************
//Borrowing a method

class Developer { 
    String firstName, lastName
    def makeExcuse(){ println "I'm compiling!" }
}

josh = new Developer( firstName : 'Joshua', lastName : 'Caito' )

class Manager { 
    String firstName = 'Big'
    String lastName = 'Cheese'
}

boss = new Manager()

try{ 
    boss.work(3) 
} catch( e ) {
    println "I've delegated that, I swear!"
}

boss.metaClass.work = josh.&makeExcuse
boss.work()