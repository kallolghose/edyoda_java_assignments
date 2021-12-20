<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Customer Registration Form</title>
    <style>
        .error {
            color:red;
        }
    </style>
</head>
<body>

     <p>Registration Form</p>
     <form:form action="processForm" modelAttribute="customer">
        First Name : <form:input path="firstName" placeholder="Value Here"/>
        <br><br>
        Last Name (*) : <form:input path="lastName"/>
        <form:errors path="lastName" cssClass="error"/>
        <br><br>
        Free Passes (*) : <form:input path="freePasses"/>
        <form:errors path="freePasses" cssClass="error"/>
        <br><br>
        <input type="submit" value="Submit">
     </form:form>

</body>
</html>