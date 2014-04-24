// Person.groovy
/**
 *   Defualt Imports
 *   Java
 *   -------------------------
 *   java.lang
 *    
 *   Groovy
 *   --------------------------
 *   java.io.*
 *   java.lang.*
 *   java.math.BigDecimal
 *   java.math.BigInteger
 *   java.net.*
 *   java.util.*
 *   groovy.lang.*
 *   groovy.util.*
 */
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
