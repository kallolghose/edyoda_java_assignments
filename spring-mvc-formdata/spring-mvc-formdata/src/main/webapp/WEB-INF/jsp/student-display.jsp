<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>After Registration</title>
</head>
<body>
    <p>
        Student Name : <span>${student.firstName}</span>&nbsp;<span>${student.lastName}</span>
    </p>
    <p>
        Country : <span>${student.country}</span>
    </p>
    <p>
        Favourite Language : <span>${student.language}</span>
    </p>
    <p>
        Operating Systems :
        <ul>
            <c:forEach var="temp" items="${student.operatingSystems}">
                <li> ${temp} </li>
            </c:forEach>
        </ul>
    </p>
</body>
</html>