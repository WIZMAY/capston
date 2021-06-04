<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" import="model.form.* , model.encrypt.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>form-info</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");

	FormDAO dao = FormDAO.getInstance();
	Form form = null;


	String title = null;
	String description = null;
	int form_id = 0;
	String encryptform_id=null;
	
	title = request.getParameter("title");
	description = request.getParameter("description");
	
	form = new Form(title, description);
	form_id = dao.insertForm(form);
	
	encryptform_id = LocalEncrypter.returnEncryptCode(Integer.toString(form_id));
	%>
	<script>
	var parent = window.opener;
	parent.location.href = "makeForm.jsp?f=" + "<%=encryptform_id%>";
	window.close();
	</script>
	
</body>
</html>