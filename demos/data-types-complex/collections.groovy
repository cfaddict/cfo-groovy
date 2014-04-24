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

// find

// find all

// collect

// ------------------------------------- MAPS -------------------------------------------------------------

// create

// looping

// getting keys and values

// collect

// different types of maps