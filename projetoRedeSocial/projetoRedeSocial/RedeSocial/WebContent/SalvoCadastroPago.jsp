<%@ page import="br.com.projeto.bens.UsuarioDois" %>
<%@ page import="br.com.projeto.redesocial.UsuarioDAODois" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Cadastro Pago </title>
</head>
<body>
<%
	String snome = request.getParameter("nome_usuario");
	String ssenha = request.getParameter("senha");
	String sdata_nasc = request.getParameter("data_nascimento");
	String sdata_ciencia = request.getParameter("data_ciencia");
	String sestado = request.getParameter("estado");
	String scidade = request.getParameter("cidade");
	String ssalario = request.getParameter("salario");
	String snivelInstrucao = request.getParameter("nivelInstrucao");
	String sempresa = request.getParameter("empresa");
	String snum_cartao = request.getParameter("num_cartao");
	String snome_resp = request.getParameter("nome_resp");
	String sdt_validade = request.getParameter("dt_validade");
	String scvc = request.getParameter("cvc");
	
	UsuarioDois usu = new UsuarioDois();
	
	usu.setNome_usuario(snome);
	usu.setSenha(ssenha);
	usu.setData_nascimento(sdata_nasc);
	usu.setData_ciencia(sdata_ciencia);
	usu.setEstado(sestado);
	usu.setCidade(scidade);
	usu.setSalario(ssalario);
	usu.setNivelInstrucao(snivelInstrucao);
	usu.setEmpresa(sempresa);
	usu.setNum_Cartao(snum_cartao);
	usu.setNome_Resp(snome_resp);
	usu.setDt_Validade(sdt_validade);
	usu.setCvc(scvc);
	
	UsuarioDAODois usuDao = new UsuarioDAODois();
	usuDao.cadastro(usu);
%>

	<h1> Salvo com sucesso! </h1>
	<a href="LoginUsu.jsp"> Entrar com a conta cadastrada! </a>
</body>
</html>