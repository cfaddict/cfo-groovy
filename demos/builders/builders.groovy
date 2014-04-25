// XML
import groovy.xml.MarkupBuilder

new MarkupBuilder().products {
    
    3.times { num ->
        product(id:num+1) {
            name "product ${num}"
        }
    }

}

// MARKUP 
import groovy.xml.MarkupBuilder
 
def sb = new StringWriter()
def html = new MarkupBuilder(sb)

html.html {
    head {
        title ('Heading')
        script (src: 'test.js', type: 'text/javascript')
    }
    body {
        ul {
            for (def i=1;i<=10;i++) {
                li (i)
            }
        }
    }
}
 
println sb.toString()

// JSON
def builder = new groovy.json.JsonBuilder()

def root = builder.people {
   person {
       firstName 'Dan'
       lastName 'Vega'
       // Named arguments are valid values for objects too
       address(
               city: 'Cleveland',
               state: 'OH',
               zip: 44107,
       )
       // a list of values
       conferences 'cfObjective', 'Gr8conf'
   }
}

println builder.toString()

// WORKING WITH JSON 
import groovy.json.JsonSlurper

def slurper = new JsonSlurper()
def result = slurper.parseText('{"people":{"person":{"firstName":"Dan","lastName":"Vega","address":{"city":"Cleveland","state":"OH","zip":44107},"conferences":["cfObjective","Gr8conf"]}}}')

println result.people
println result.people.person
println result.people.person.address
println result.people.person.address.city