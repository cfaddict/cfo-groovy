//Logical Branching

//*************************************************************************************************************
//Switch statement
def x = 'This is interesting'

switch( x ) {
    
    case ~/(?i)\bthis.*/:
        println 'first'

    case String:
        println 'second'

    case 'This is interesting':
        println 'third'
        break

}





//*************************************************************************************************************
//Looping

0.upto(4) { println( 'Hello World!' ) }
4.times { println( 'Hi World!' ) }

for( x in 0..1 ) {println 'hi'}

def x = [ 1:'dog', 2:'cat', 3:'bird' ]
for( i in x ) { println i.value }
