<%@ page import="br.com.projeto.bens.Usuario" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Atualiza��o do perfil </title>
</head>
<body>
<%
	Usuario usu = (Usuario)request.getAttribute("nome_usuario");
%>

<form action="UsuarioControllador" method="POST">
	<input type="hidden" name="acao" value="salvar">
	
	<label> Nome de Usu�rio </label> </br>
    <input type="text" name="nome_usuario" value="<%=usu.getNome_usuario() %>" /> </br>
    <label> Senha </label> </br>
    <input type="text" name="senha" value="<%=usu.getSenha() %>" /> <br>
    <label> Data de Nascimento </label> </br>
    <input type="text" name="data_nascimento" value="<%=usu.getData_nascimento() %>" /> <br>
    <label> Data de In�cio em Ci�ncia de Dados </label> </br>
    <input type="text" name="data_ciencia"  value="<%=usu.getData_ciencia() %>" /> <br>
    <label> Estado </label> </br>
    <input type="text" name="estado" value="<%=usu.getEstado() %>" /> </br>
    <label> Cidade </label> </br>
    <input type="text" name="cidade" value="<%=usu.getCidade() %>" /> </br>
    <label> Salario </label> </br>
    <input type="number" name="salario" value="<%=usu.getSalario() %>" /> </br>
    <label> N�vel de Instru��o </label> </br>
    <input type="text" name="nivelInstrucao" value="<%=usu.getNivelInstrucao() %>" /> </br>
    <label> Empresa Atual </label> </br>
    <input type="text" name="empresa" value="<%=usu.getEmpresa() %>" /> </br></br>

	<input type="submit" value="Salvar" />
</form>
	
</body>
</html>