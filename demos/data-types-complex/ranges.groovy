// basic ranges
def range = 1..10
def reverseRange = 10..1

println range
println reverseRange

println range.size()
println range.get(2)
println range.contains(5) 
println range.from 
println range.to 
println range instanceof java.util.List 

// string manipulation
def str = "Hello cfObjective, thanks for coming to our presentation"

//str.getAt(0)
str[-1..-10]

// .size()
str[0..str.size()-1]