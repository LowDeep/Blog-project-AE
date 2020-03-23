
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>

	<% if(request.getAttribute("title")!=null){
	
	out.print(request.getAttribute("title"));
	
	}
	else out.print("Unknow Page"); %>
	
</title>
</head>
<body>
