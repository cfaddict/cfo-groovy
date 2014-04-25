// we have a list
def characters = ["Daenerys Targaryen","Tyrion Lannister","Joffrey Baratheon","Sansa Stark"]

// add a new character
characters << "Jaime Lannister"

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




