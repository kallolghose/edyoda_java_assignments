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
        Favourite Language:
        Java <form:radiobutton path="language" value="Java" />
        C# <form:radiobutton path="language" value="C#" />
        Python <form:radiobutton path="language" value="Python" />
        Go Lang <form:radiobutton path="language" value="Go Lang" />
        <br><br>
        Operating Systems:
        Windows 7 <form:checkbox path="operatingSystems" value="Windows 7" />
        Windows 10 <form:checkbox path="operatingSystems" value="Windows 10" />
        Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
        Linux <form:checkbox path="operatingSystems" value="Linux" />
        <br><br>
        <input type="submit" value="submit" />
    </form:form>
    </div>
</body>
</html>