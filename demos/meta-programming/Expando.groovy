//*************************************************************************************************************
//Expando class

class Human {
    String name
}
human = new Human()
try {
    human.with {
        age = 906
        catchPhrase = "PLEASE DON'T KILL ME!"
        sonic = { -> println "WeeOooWeeOoo" }
    }
    println "I am a human and I am $human.age years old! ${human.catchPhrase}"
    human.sonic()
    assert human.name == null
} catch( e ) {
    println "Human's can't do any of that! - ${e}"
}












//*************************************************************************************************************
class TimeLord extends Expando {
    String name
}
theDoctor = new TimeLord()
try {
    theDoctor.with {
        age = 906
        catchPhrase = "PLEASE DON'T KILL ME!"
        sonic = { -> println "WeeOooWeeOoo" }
    }
    println "I am the Doctor and I am $theDoctor.age years old! ${theDoctor.catchPhrase}"
    assert theDoctor.name == null
    theDoctor.sonic()
} catch( e ) {
    println e
}