<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Home</title>
</head>
<body>
    <p>
        Home Page in Java Configuration
    </p>
     <form:form action="${pageContext.request.contextPath}/logout" method="POST">
        <input type="submit" value="Logout"/>
     </form:form>
</body>
</html>