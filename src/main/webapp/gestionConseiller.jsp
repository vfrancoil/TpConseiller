<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gestion conseiller</title>
</head>
<body>

	<div>
<form action="MainServlet" method="post">
		<table>
			<caption>Gestion conseiller</caption>

			<tr>
				<th>Nom :</th>
				<th><input type="text" name="name" /></th>
				<th>Prénom :</th>
				<th><input type="text" name="firstname" /></th>
			</tr>
			<tr>
				<th>Date de naissance :</th>
				<th><input type="text" name="dob" /></th>
				<th>Salaire :</th>
				<th><input type="text" name="salary" /></th>
			</tr>
			<tr>
				<th>Numéro conseiller :</th>
				<th><input type="text" name="numConseiller" /></th>
				<th>Date de création :</th>
				<th><input type="text" name="createDate" /></th>
			</tr>
			<tr>
				<th colspan="2"><input type="submit" name="modifier" value="Modifier" /></th>
				<th colspan="2"><input type="submit" name="supprimer" value="Supprimer" /></th>
			</tr>
		</table>
</form>
	</div>



</body>
</html>