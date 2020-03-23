<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<jsp:include page= "/WEB-INF/pagesJSP/header.jsp" flush="true" /> 

	<h1>Entry Form</h1>
	<form method="post">
		<div>
		Username :<br>
		<input type="text" name="username" size="30" required>
		</div><br>
		
		<div>
		Firstname :<br>
		<input type="text" name="firstname" size="30" required>
		</div><br>
		<div>
		Lastname :<br>
		<input type="text" name="lastname" size="30" required>
		</div><br>
		
		<div>
		Age :<br>
		<input type="number" name="age" required>
		</div><br>
		
		<div>
		City :<br>
		<input type="text" name="city" size="40" required>
		</div><br>
		
		<div>
		Sexe :<br>
		<select name="sexe">
			<option value="Woman">Woman</option>
			<option value="Man">Man</option>
		</select>
		</div><br>
		
		<div>
		Password :<br>
		<input type="text" name="password" size="40" required>
		</div><br>
		
		
		<input type="submit" name="submit" value="Create my account">
	</form>
		
<jsp:include page= "/WEB-INF/pagesJSP/footer.jsp" flush="true" /> 