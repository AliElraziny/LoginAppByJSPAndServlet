<?xml version="1.0" encoding="windows-1256" ?>
<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
 <%@ page import="com.trycoding.dto.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256" />
<title>Success</title>
</head>
<body>


	<h3>Login Successful ... </h3>
	
	<%
		//with send redirect
		User user = (User)session.getAttribute("user");
		
		//with dipatcher
	    //User user = (User)request.getAttribute("user");
	
	%>
	
	Salam Alaykom <%=user.getUserName() %>!!
	
	
</body>
</html>