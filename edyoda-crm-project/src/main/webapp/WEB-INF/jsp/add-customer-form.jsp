<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>
        Add Customer
    </title>
    <link type="text/css"
    		  rel="stylesheet"
    		  href="${pageContext.request.contextPath}/resources/css/style.css">

    <link type="text/css" rel="stylesheet"
        		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css" />
</head>
<body>
    <div id="wrapper">
        <div id="header">
            <h2>CRM - Customer Relationship Manager</h2>
        </div>

        <div id="content">
            <form:form action="saveCustomer" modelAttribute="customer" method="POST">
                 <table>
                        <tbody>
                            <tr>
                                <td><label>First name:</label></td>
                                <td><form:input path="firstName" /></td>
                            </tr>

                            <tr>
                                <td><label>Last name:</label></td>
                                <td><form:input path="lastName" /></td>
                            </tr>

                            <tr>
                                <td><label>Email:</label></td>
                                <td><form:input path="email" /></td>
                            </tr>

                            <tr>
                                <td><label></label></td>
                                <td><input type="submit" value="Save" class="save" /></td>
                            </tr>
                        </tbody>
                    </table>
            </form:form>
        </div>

        <br>
        <a href="${pageContext.request.contextPath}/customer/list">Show Customer List</a>

    </div>
</body>
</html>