package com.vega

import groovy.xml.MarkupBuilder

class Builder {
	
	String create(){
		def writer = new StringWriter()
		def xml = new MarkupBuilder(writer)

		xml.root {
		   a( a1:'one' ) {
		     b { mkp.yield( '3 < 5' ) }
		     c( a2:'two', 'blah' )
		   }
		 }

		 writer.toString()
	}


}