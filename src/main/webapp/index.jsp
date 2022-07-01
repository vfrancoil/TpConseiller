<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
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
			</thead>
			
			<tbody>
				<c:forEach var="i" items="${allConseiller}">
				  	<tr>
			            <td>${i.name}</td>
			            <td>${i.firstName}</td>
			            <td>${i.dob}</td>
			            <td>${i.salary}</td>
			            <td>${i.numConseiller}</td>
			            <td>${i.dateCreation}</td>
			            <td><a href="<c:url value="/ConseillerServlet?id=${i.id}"/>">Fiche conseiller</a></td>
			        </tr>
				</c:forEach>
			</tbody>
		</table>
<br /><br />
		<form action="MainServlet" method="post">
		
	
			<table>
				<caption>Ajouter un client</caption>
	
				<tr>
					<th><input type="text" placeholder="Saisir Nom" name="name" /></th>
					<th><input type="date" placeholder="Saisir DOB" name="DOB" /></th>				
				</tr>
				<tr>
					<th><input type="text" placeholder="Saisir Prénom"	name="firstName" /></th>
					<th><input type="text" placeholder="Saisir Salaire" name="salary" /></th>
					
				</tr>
				<tr>
				<th colspan="2"><input type="submit" value="Ajouter" name="ajouter"/></th>
				</tr>
				
				
			</table>

	</form>

	</div>
</body>
</html>