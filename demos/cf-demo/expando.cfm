<cfscript>
	ex = createObject("java", "groovy.util.Expando").init();

	ex.setProperty("foo","foo");

	writeDump(ex);
	writeDump(ex.getProperties());

</cfscript>