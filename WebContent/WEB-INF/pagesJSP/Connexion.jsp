<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<jsp:include page= "/WEB-INF/pagesJSP/header.jsp" flush="true" /> 

	<h1>Connexion Form</h1>
	<form method="post">
		<div>
		Username :<br>
		<input type="text" name="username" size="30" required>
		</div><br>
		
		<div>
		Password :<br>
		<input type="text" name="password" size="40" required>
		</div><br>
		
		<input type="submit" name="submit" value="Connect to my account">
	</form>
		
<jsp:include page= "/WEB-INF/pagesJSP/footer.jsp" flush="true" /> 