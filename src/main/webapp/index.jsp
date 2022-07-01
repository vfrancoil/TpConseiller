<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>

		<table border=1>
			<thead>
				<tr>
					<th>Nom</th>
					<th>Prénom</th>
					<th>Date de naissance</th>
					<th>Salaire</th>
					<th>Numéro conseiller</th>
					<th>Date de création</th>
					<th></th>
				</tr>
			<thead>
		</table>
<br /><br />
		<form action="MainServlet" method="post">
		
	
			<table>
				<caption>Ajouter un client</caption>
	
				<tr>
					<th><input type="text" placeholder="Saisir Nom" name="name" /></th>
					<th><input type="text" placeholder="Saisir DOB" name="DOB" /></th>				
				</tr>
				<tr>
					<th><input type="text" placeholder="Saisir Prénom"	name="firstName" /></th>
					<th><input type="text" placeholder="Saisir Salaire" name="Salary" /></th>
					
					
				</tr>
				<tr>
				<th colspan="2"><input type="submit" value="Ajouter" /></th>
				</tr>
				
				
			</table>

	</form>

	</div>
</body>
</html>