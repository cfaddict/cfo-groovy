// we have a list
def characters = ["Daenerys Targaryen","Tyrion Lannister","Joffrey Baratheon","Sansa Stark"]

// add a new character
characters << "Jaime Lannister"

/*

// classic for in loop
for( person in characters ){
    //println person
}

// each 
characters.each({
    //println it
})

// each with index
characters.eachWithIndex { item, index ->
    //println "$index: $item"
}

// find & findAll
characters.find {
    it.contains('Lannister')
}

characters.findAll {
    it.contains('Lannister')
}

// collect
def uppers = []
characters.each {
    uppers << it.toUpperCase()
}

println uppers

def lowers = characters.collect {
    it.toLowerCase()
}
println lowers

// ------------------------------------- SORTING -------------------------------------------------------------
def numbers = [1,3,5,6,2,4,1]
println numbers.sort()

def list= ['abc', 'z', 'xyzuvw', 'Hello', '321']
println list.sort{ it.size() }


class Task implements Comparable {
    String name
    
    int compareTo(Object o) { 
        return name.compareTo(o.name) 
    }
    
    String toString(){
        name
    }
}

def tasks = [new Task(name:'a'),new Task(name:'z'),new Task(name:'c')]
println tasks.sort()

// ------------------------------------- List vs Set vs Sorted Set -------------------------------------------------------------
def numbers = [1,3,5,6,2,4,1]

println numbers.class.name
// an arrayList can contain anything
println numbers

// Set (java.util.HashSet)
// http://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html
Set numbers = [1,2,3,4,5,null,2]

println numbers
println numbers.class.name

// This class implements the Set interface, backed by a hash table (actually a HashMap instance). 
// It makes no guarantees as to the iteration order of the set; 
// in particular, it does not guarantee that the order will remain constant over time. 
// This class permits the null element.

// LinkedHashSet
// http://docs.oracle.com/javase/7/docs/api/java/util/LinkedHashSet.html
LinkedHashSet numbers = [1,2,3,4,5]

println numbers
println numbers.class.name


// A LinkedHashSet is an ordered version of HashSet that maintains a doubly-linked List across all elements. 
// Use this class instead of HashSet when you care about the iteration order. 
// When you iterate through a HashSet the order is unpredictable, while a LinkedHashSet 
// lets you iterate through the elements in the order in which they were inserted.

"
http://docs.oracle.com/javase/7/docs/api/java/util/Collections.html

List — an ordered collection (sometimes called a sequence). Lists can contain duplicate elements. The user of a List generally has precise control over where in the list each element is inserted and can access elements by their integer index (position). If you've used Vector, you're familiar with the general flavor of List. 
Set — a collection that cannot contain duplicate elements. This interface models the mathematical set abstraction and is used to represent sets, such as the cards comprising a poker hand, the courses making up a student's schedule, or the processes running on a machine.

A LinkedHashSet is an ordered version of HashSet that maintains a doubly-linked List across all elements. Use this class instead of HashSet when you care about the iteration order. When you iterate through a HashSet the order is unpredictable, while a LinkedHashSet lets you iterate through the elements in the order in which they were inserted.

http://docs.oracle.com/javase/tutorial/collections/interfaces/index.html
"




// ------------------------------------- MAPS -------------------------------------------------------------

// create
def map = [:]
def map = [first:'Dan',last:'Vega',email:'danvega@gmail.com',dob:new Date('08/21/1978')]
map.class.name // why this doesn't work

map["first"]

// looping
map.each {
    println it
}

map.each { k,v ->
    println "key:$k - val:$v"
}

// getting keys and values
// we could do this 

def keys = map.collect { k,v ->
    k
}
println keys

def values = map.collect { k,v ->
    v
}
println values

// but this is easier 
println map.keySet()
println map.values()

*/

