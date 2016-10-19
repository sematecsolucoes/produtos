<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="windows-1256"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>Login Page</title>
</head>

<body>
	<h2>Login no Controle de Produtos</h2>
	<form action="login" method="post">
		Login: <input type="text" name="login" />
		<br />
		Senha: <input type="password" name="senha" />
		<br />
		<input type="submit" value="Autenticar" />
	</form>
	<%
		if (request.getAttribute("erro") != null) {
	%>
	<h2>
		<%=request.getAttribute("erro")%>
	</h2>
	<%
		}
	%>
</body>
</html>