class Demo {

    def writer() {
        def c = {
            append 'Dan'
            append ' lives in Cleveland'
        }
        c()
    }
    
}

def demo = new Demo()
demo.writer()


/******************************************************************************/






class Demo {

    def writer() {
        def c = {
            append 'Dan'
            append ' lives in Cleveland'
        }
        c()
    }
    
    def append(String s){
        println "Demo.append() called with argument of $s"
    }
    
}

def demo = new Demo()
demo.writer()


/******************************************************************************/




//http://docs.oracle.com/javase/7/docs/api/java/lang/StringBuffer.html


class Demo {

    def writer() {
        def c = {
            append 'Dan'
            append ' lives in Cleveland'
        }
        def sb = new StringBuffer()
        c.delegate = sb
        c()
    }
    
}

def demo = new Demo()
demo.writer()



/******************************************************************************/

// RESOLVE STRATEGY
// c.resolveStrategy = Closure.DELEGATE_FIRST
//http://beta.groovy-lang.org/docs/groovy-2.3.1-SNAPSHOT/html/gapi/groovy/lang/Closure.html



class Demo {

    def writer() {
        def c = {
            append 'Dan'
            append ' lives in Cleveland'
        }
        def sb = new StringBuffer()
        c.delegate = sb
        c()
    }
    
    def append(String s){
        println "Demo.append() called with argument of $s"
    }    
    
}

def demo = new Demo()
demo.writer()



/******************************************************************************/




/* curry example *************************************************************/

// General closure to use a filter on a list.
def filterList = { filter, list -> list.findAll(filter) }
// Closure to find even numbers.
def even = { it % 2 == 0 }
// Closure to find odd numbers.  
def odd = { !even(it) }  
// Other closures can be curry parameters.
def evenFilterList = filterList.curry(even)
def oddFilterList = filterList.curry(odd)
assert [0,2,4,6,8] == evenFilterList(0..8)
assert [1,3,5,7] == oddFilterList(0..8)



/******************************************************************************/