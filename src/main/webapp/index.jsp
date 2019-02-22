<html>
<body>
	<Form POST ="MyServlet" METHOD=POST>
		Nom <INPUT NAME="nom">
		<p>
			Prénom <INPUT NAME="prenom">
		<p>
			<INPUT TYPE=SUBMIT VALUE="Envoi">
	</Form>
	<h2></h2>
</body>
<%@ page import="java.util.Date"%>
<%= new Date() %>
<%
String nom = request.getParameter("nom");
String prenom = request.getParameter("prenom");
if ("HAMMAR".equals(nom) && "Hocine".equals(prenom))
{
 out.println("le programme marche " + nom + " " + prenom);	
 
 } %>
 <br>
 <%
 String nom1 = (String)request.getAttribute("nom1");
 if (nom1 == null)
 {
	 out.println("");
 }
 else {
 out.println(nom1);
 }
 %>
<%-- <%out.println(request.getAttribute("testnom")); %> --%>
</html>