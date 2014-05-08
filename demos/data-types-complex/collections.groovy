/* create a list, add to it and loop over it *********************************************************************/

def characters = ["Daenerys Targaryen","Tyrion Lannister","Joffrey Baratheon","Sansa Stark"]

// add a new character
characters << "Jaime Lannister"

// classic for in loop
for( person in characters ){
    println person
}

/****************************************************************************************************************/






/* loop over arrays the groovy way ******************************************************************************/

def characters = ["Daenerys Targaryen","Tyrion Lannister","Joffrey Baratheon","Sansa Stark","Jaime Lannister"]

// each 
characters.each({
    println it
})

println "-------------------------------"

// each with index
characters.eachWithIndex { item, index ->
    println "$index: $item"
}

/***************************************************************************************************************/






/* searching a collection **************************************************************************************/

def characters = ["Daenerys Targaryen","Tyrion Lannister","Joffrey Baratheon","Sansa Stark","Jaime Lannister"]

// find & findAll
println characters.find {
    it.contains('Lannister')
}

println characters.findAll {
    it.contains('Lannister')
}

/***************************************************************************************************************/






/* collect() ***********************************************************************************************/

def characters = ["Daenerys Targaryen","Tyrion Lannister","Joffrey Baratheon","Sansa Stark","Jaime Lannister"]

def uppers = []
characters.each {
    uppers << it.toUpperCase()
}

println uppers

def lowers = characters.collect {
    it.toLowerCase()
}
println lowers

/************************************************************************************************************/








/* Sorting ***********************************************************************************************/
def numbers = [1,3,5,6,2,4,1]
println numbers.sort()

def list= ['abc', 'z', 'xyzuvw', 'Hello', '321']
println list.sort{ it.size() }


// how about sorting classes

class Task implements Comparable {
    String name
    
    int compareTo(Object o) { 
        return name.compareTo(o.name) 
    }
    
    String toString(){
        name
    }
}

def tasks = [new Task(name:'Joe'),new Task(name:'Dan'),new Task(name:'Cathy')]
println tasks.sort()

// Groovy 2.3 @Sortable (groovy.transform.Sortable)

class Person {
    String first
    String last
    
    String toString(){ 
        "$first $last"
    }
}

def people = [
    new Person(first:'Dan',last:'Vega'),
    new Person(first:'Sam',last:'Farmer'),
    new Person(first:'Josh',last:'Caito'),
    new Person(first:'Lance',last:'Staples')
]

println people.sort()

/************************************************************************************************************/






// ------------------------------------- List vs Set vs Sorted Set -------------------------------------------------------------


//Set – Stored elements in unordered or shuffles way, and does not allow duplicate values.
//List – Stored elements in ordered way, and allow duplicate values.


def numbers = [1,3,5,6,2,4,1,null]
println numbers.class.name
println numbers


// Set (java.util.HashSet)
// http://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html
// does allow nulls,order is not maintained
Set numbers = [1,2,3,4,5,null,2]
println numbers
println numbers.class.name



// LinkedHashSet
// http://docs.oracle.com/javase/7/docs/api/java/util/LinkedHashSet.html
// A LinkedHashSet is an ordered version of HashSet that maintains a doubly-linked List across all elements. 
// Use this class instead of HashSet when you care about the iteration order. 
// When you iterate through a HashSet the order is unpredictable, while a LinkedHashSet 
// lets you iterate through the elements in the order in which they were inserted.

LinkedHashSet numbers = [1,2,3,4,5]

println numbers
println numbers.class.name



// ------------------------------------- MAPS -------------------------------------------------------------

// create
def emptyMap = [:]
def map = [first:'Dan',last:'Vega',email:'danvega@gmail.com',dob:new Date('08/21/1978')]

println map.class.name // why this doesn't work
println emptyMap
println map



// looping
def map = [first:'Dan',last:'Vega',email:'danvega@gmail.com',dob:new Date('08/21/1978')]
map.each {
    println it
}

println "------------------"

map.each { k,v ->
    println "key:$k - val:$v"
}



// getting keys and values
// we could loop over and use our new fancy collect method 

def map = [first:'Dan',last:'Vega',email:'danvega@gmail.com',dob:new Date('08/21/1978')]

// but this is easier 
println map.keySet()
println map.values()
