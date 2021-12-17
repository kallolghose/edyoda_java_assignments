<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>This Is Spring</title>
</head>
<body>
    <p>Student : ${student.firstName} ${student.lastName} has registered</p>
    <p>Country : ${student.country}</p>
    <p>Language : ${student.language}</p>
    <p>OS :
        <ul>
            <c:forEach var="temp" items="${student.operatingSystem}">
                <li> ${temp} </li>
            </c:forEach>
        </ul>
    </p>
</body>
</html>