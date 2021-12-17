<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>This Is Spring</title>
</head>
<body>
    	<form:form action="processForm" modelAttribute="student">
    		First name: <form:input path="firstName" />
    		<br><br>
    		Last name: <form:input path="lastName" />
    		<br><br>
             Country :
               <form:select path="country">
                <form:options items="${student.countryOptions}" />
               </form:select>
             <br><br>
             Favourite Language:
             Java <form:radiobutton path="language" value="Java" />
             C# <form:radiobutton path="language" value="C#" />
             PHP <form:radiobutton path="language" value="PHP" />
             Python <form:radiobutton path="language" value="Python" />

             <br><br>
                          Operating System :
                          Windows <form:checkbox path="operatingSystem" value="Windows" />
                          Mac OS <form:checkbox path="operatingSystem" value="MacOX" />
                          Linux <form:checkbox path="operatingSystem" value="Linux" />
             <br><br>
    		<input type="submit" value="Submit" />
               <br><br>
    	</form:form>

</body>
</html>