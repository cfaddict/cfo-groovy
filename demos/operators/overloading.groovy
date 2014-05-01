//Operator Overloading

//So, groovy allows us to overload the following operators: +,-,*,**,/,%,|,&,^,++,--,[i],[i]=,<<,>>,~a,-i,+i

//Holy heck that's a lot!

//*************************************************************************************************************
//For the purposes of this demo though, we're going to overload the plus operator just for a demo

class Spouse {
    def firstName
    def lastName
    def maidenName
    
    def plus = { SpouseB ->
        SpouseB.with {
            maidenName = lastName
            lastName = this.lastName
        }        
    }
    
    def getFullName() {
        "$firstName $lastName"
    }
}

def john = new Spouse( firstName:'John', lastName:'Smith' )
def jane = new Spouse( firstName:'Jane', lastName:'Doe' )

println "Poor sap #1 is: $john.fullName"
println "Poor sap #2 is: $jane.fullName"

//Let's get hitched!

john + jane

println "The happy couple: $john.fullName & $jane.fullName however sometimes Jane still wishes she was a $jane.maidenName again..." //Oh no! How sad!

//A silly example, but you can see the exstensibility that operator overloading can offer!
