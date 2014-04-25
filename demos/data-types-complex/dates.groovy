// new date + dob
def now = new Date()
def dob = new Date('08/21/1978')

println now
println dob

// creating dates from strings
String now = "04/24/2014"
def d = new Date(now)

String now2 = "Thursday April 24 2014"
def d2 = new Date(now)

println d
println d2

// date format 
// http://groovy.codehaus.org/groovy-jdk/java/util/Date.html#format(java.lang.String)
// http://docs.oracle.com/javase/1.5.0/docs/api/java/text/SimpleDateFormat.html
def now = new Date()

def formatted = now.format('MM/dd/yyyy')
def month = now.format('M') // show M MM MMM
def day = now.format('d') // show d + D ... EEEE
def time = now.format('hh:mm:ss a') // HH

println formatted
println month
println day
println time

// add,subtract,compare
def now = new Date()
def tomorrow = now + 1
def yesterday = now - 1

println now
println tomorrow
println yesterday

// time category
import groovy.time.TimeCategory

def now = new Date()

use(TimeCategory){
    println now + 1.week
    println now + 1.month
    println now + 1.year
    println now - 30.seconds
    println now - 30.minutes
    println now - 1.hour
    
    println now + 1.week + 1.month + 5.years
}

// date compare 
def d1 = new Date()
def d2 = new Date() + 7

// compareTo (operator overloading)
// http://groovy.codehaus.org/Operator+Overloading
println d1.compareTo(d2) < 0

if( d2 > d1 ) {
    println "d2 is greater than d1"
}

if( d2-7 == d1 ) {
    println "dates are equal"
}

if( d1.year == d2.year ) {
    println "years are the same"
}

