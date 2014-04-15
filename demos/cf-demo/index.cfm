<cfobject type="java" class="com.vega.Person" name="Person"> 

<cfscript>
	p = Person.init();
	p.firstName = "Dan";
	p.lastName = "Vega";

	writeDump(p.toString());

</cfscript>