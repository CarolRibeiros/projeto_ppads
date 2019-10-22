<%@ page import="java.util.List" %>
<%@ page import="br.com.projeto.bens.Usuario" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Amigos </title>
</head>
<body>

<%
	List<Usuario> listaResultado = (List<Usuario>)request.getAttribute("lista");
%>

<table>

	<th>
		<td> Nome de usuário </td>
	</th>
	<th>
		<td> Senha </td>
	</th>
	<th>
		<td> Data de nascimento </td>
	</th>
	<th>
		<td> Data ciência </td>
	</th>
	<th>
		<td> Estado </td>
	</th>
	<th>
		<td> Cidade </td>
	</th>
	<th>
		<td> Salário </td>
	</th>
	<th>
		<td> Nível de instrução </td>
	</th>
	<th>
		<td> Empresa </td>
	</th>

<%
	for(Usuario u:listaResultado){
%>

<tr>
	<th>
		<td> <%=u.getNome_usuario() %> </td>
	</th>
	<th>
		<td> <%=u.getSenha() %> </td>
	</th>
	<th>
		<td> <%=u.getData_nascimento() %> </td>
	</th>
	<th>
		<td> <%=u.getData_ciencia() %> </td>
	</th>
	<th>
		<td> <%=u.getEstado() %> </td>
	</th>
	<th>
		<td> <%=u.getCidade() %> </td>
	</th>
	<th>
		<td> <%=u.getSalario() %> </td>
	</th>
	<th>
		<td> <%=u.getNivelInstrucao() %> </td>
	</th>
	<th>
		<td> <%=u.getEmpresa() %> </td>
	</th>
	<th>
		<td> <a href="UsarioControllador?acao=alt&nome_usuario=<%=u.getNome_usuario()%>"> Alterar </a> </td>
	</th>
	
</tr>
<%
}
%>
</table>

</body>
</html>