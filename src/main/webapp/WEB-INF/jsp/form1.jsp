<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<html>
<head>
<title>Reservation Form</title>
</head>
<body>

	<jsp:useBean id="list" class="com.bean.ListBean" />

	<jsp:getProperty name="list" property="message" />
	
	<br />
	<br />

	<h2>Reservation Form</h2>
	<form action="<c:url value='success'/>" method="post">
		<label>First Name: <input type="text" name="firstName" /></label><br />
		<label>Last Name: <input type="text" name="lastName" /></label><br />


		<label>Source Station:</label> <select name="sourceStation">
			<c:forEach var="item" items="${list.items}">
				<option value="${item}">${item}</option>
			</c:forEach>
		</select> <br>
		 <label>Destination Station:</label> <select
			name="destStation">
			<c:forEach var="item" items="${list.items}">
				<option value="${item}">${item}</option>
			</c:forEach>
		</select><br> 
		
		 <label>Gender:</label>
        <c:forEach var="gender" items="${genders}">
            <input type="radio" name="gender" value="${gender}"/> ${gender} 
        </c:forEach><br/>		

		<input type="submit" value="Submit" />
	</form>
</body>
</html>
