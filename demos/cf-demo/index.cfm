<cfscript>
	p = createObject("java", "com.vega.Person").init();
	p.firstName = "Dan";
	p.lastName = "Vega";

	writeDump(p.toString());
</cfscript>