import groovy.xml.MarkupBuilder

new MarkupBuilder().products {
    
    3.times { num ->
        product(id:num+1) {
            name "product ${num}"
        }
    }

}