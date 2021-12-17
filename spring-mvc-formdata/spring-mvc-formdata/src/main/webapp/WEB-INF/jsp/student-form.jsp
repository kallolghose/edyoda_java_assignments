<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>
    <p>Registration Form</p>
    <div>
    <form:form action="processForm" modelAttribute="student">
        First Name: <form:input path="firstName" />
        <br><br>
        Last Name: <form:input path="lastName" />
        <br><br>
        Select Country :
        <form:select path="country">
        	<form:options items="${student.countryOptions}"/>
        </form:select>
        <br><br>
        <input type="submit" value="submit" />
    </form:form>
    </div>
</body>
</html>