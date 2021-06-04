<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" import="model.encrypt.LocalEncrypter"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
	//id값을 불러와서 암호화 후 form_id와 url 생성
	String id = session.getAttribute("sessionID").toString();
	String f_id = request.getParameter("form_id");
	String encryptcode = LocalEncrypter.returnEncryptCode(id);
	out.println(encryptcode);
	String decryptcode = LocalEncrypter.returnDecryptCode(encryptcode);
	out.println(decryptcode);
	String url = f_id + "/" + encryptcode;
	out.println(url);
	//response.sendRedirect("url");
	%>
</body>
</html>