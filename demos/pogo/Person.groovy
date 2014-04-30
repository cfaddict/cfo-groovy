// Person.groovy
class Person {

    String firstName
    String lastName
    
    static void main(String[] args){
        Person person = new Person(firstName:"Dan",lastName:"Vega")
        println person
    }

    String toString(){
        firstName + ' ' + lastName
    }

}
