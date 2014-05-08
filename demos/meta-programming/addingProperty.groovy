//*************************************************************************************************************
//Adding a property

class Developer { 
    String firstName, lastName
    def makeExcuse(){ println "I'm compiling!" }
}

josh = new Developer( firstName : 'Joshua', lastName : 'Caito' )
josh.metaClass.isTeamLead = true
gettingARaise = josh.isTeamLead ?: false 
println "Josh is getting a raise? ${gettingARaise}"