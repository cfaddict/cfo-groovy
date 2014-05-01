/*
//Groovy Truth

//Standard boolean operators
def a = true
def b = true
def c = false
assert a
assert a && b
assert a || c
assert !c

//Collections
def numbers = [1,2,3]
assert numbers //true, as numbers is not empty
numbers = []
assert !numbers //true, as numbers is now an empty collection

//Iterators and Enumerations
assert ![].iterator() // false because the Iterator is empty
assert [0].iterator() // true because the Iterator has a next element
def v = new Vector()
assert !v.elements()  // false because the Enumeration is empty
v.add(new Object())
assert v.elements()   // true because the Enumeration has more elements

//Maps
assert ['one':1]
assert ![:]

//Regex
assert ('Hello World' =~ /World/) //true as matcher has at least one match

// Strings
assert 'This is true'
assert !''
//GStrings
def s = ''
assert !("$s")
s = 'x'
assert ("$s")

//Non-Zero numbers
assert !0 //yeah, 0s are false, like in Perl
assert 1  //this is also true for all other number types

//Non-Null objects
assert new Object()
assert !null

//Null
assert null == false //Will fail
assert null == true //Also fails

assert !null == true //These test will pass as we're testing against state
assert !!null == false

/*
    ...and that's the groovy truth!
*/