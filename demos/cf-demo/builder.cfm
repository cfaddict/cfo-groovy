
<cfscript>

	builder = createObject("java", "com.vega.Builder").init();

	/*
	html = '
		html = {
			head = {
				title "My title"
			}
			body = {
				h1 "Hello Groovy"
				div(class:"myClass") = {
					p "test"
				}
			}
		}
	';

	//markup = builder.create();
	*/

	writeDump(builder);

</cfscript>