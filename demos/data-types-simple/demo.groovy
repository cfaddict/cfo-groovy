/*
    So, what are simple data types?    
    Well, Groovy has primitive and Wrapper versions of all our favorite standards...    
    NOTE: These (with a few exceptions we will cover later) are the Java versions of the objects
*/

//**************************************************************************************************************
//Byte is a binary representation of a number
byte ourByte = 00101101
println "$ourByte"





//**************************************************************************************************************
//Short is a 16 digit (although Groovy will convert for you) integer with a range of -32768 to 32767
short ourShort = 10000
println "$ourShort"
ourShort = 1000000000000000 //For fun sometime look up signed and unsigned representations ^_^
println "$ourShort"





//**************************************************************************************************************
//Integer is 32 bit with a range of -2^31 and 2^31-1 
int ourInt = 12345
println "$ourInt" 





//**************************************************************************************************************
// Long is a 64 bit integer with a range of -2^63 to 2^63-1 
long ourLong = 123456789
println "$ourLong"





//**************************************************************************************************************
// Float and Double are single precision and double precision decimal representations respectfully whose scale is ...large 
float ourFloat = 1.2345678999999999
println "$ourFloat"

double ourDouble = 1.2345678999999999
println "$ourDouble"





//**************************************************************************************************************
// Char is a single character value 
char ourChar = 'a'
println "$ourChar"





//**************************************************************************************************************
// Boolean is a binary switch. On or off. 0 or 1 
boolean ourBoolean = 1 //1 = true or on
println "$ourBoolean"






//**************************************************************************************************************
// So, what is the difference between primitive and wrapper data-types? 

class Foo{
    boolean a //Primitive data type
    Boolean b //Wrapper class
}

foo = new Foo()

println foo.a.class.name
println foo.a // primitive will initalize with a value of zero
println foo.b?.class?.name
println foo.b // null object

// So what happens when we try to set the primitive to null? 

foo.b = 0
try{
    foo.a = null
} catch( e ) {
    print "We tried to set a primitive to null and we got this: "
    println e
}

/*

In a nutshell, Groovy will autobox primitive types for you upon creation outside of a class, but tends to be more strict with property declaration.
It will attempt to set a default value (in this case zero) and the AST of the class will show (at least intially) that the nodes are different

*/