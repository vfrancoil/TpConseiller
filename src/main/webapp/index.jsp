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
					<th>Pr�nom</th>
					<th>Date de naissance</th>
					<th>Salaire</th>
					<th>Num�ro conseiller</th>
					<th>Date de cr�ation</th>
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
					<th><input type="text" placeholder="Saisir Pr�nom"	name="firstName" /></th>
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