<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value = "NovaEmpresa" var = "NovaEmpresa"/>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Cadastro da empresa</title>
</head>

<body>
 	<form action="${NovaEmpresa }" method="post">
		Nome: <input type="text" name="nome" />
		Data: <input type="text" name="data" />
		<input type="submit" />

	</form>
</body>

</html>