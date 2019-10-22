<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title> Login </title> 
        <style>
     		body{background-color:silver;}        
     		h1 {text-align: center; color: steelblue; font-family: fantasy; font-size: 70px;margin-bottom: -4px; padding: 1px;}
     		h2 {color:black; font-size: 30px; font-family: fantasy; margin-top: 1px;}    
     		a {color: steelblue;}
     		label {color: black; font-size: 20px; font-family: fantasy; margin-top: -2px;}      
        </style>
    </head>
    <body>
        <h1> Data Science Social </h1>
        <h2> Uma rede social dedicada exclusivamente para você: Cientista de Dados! </h2>
        <h2> O Data Science Social te ajuda a se conectar com todos os cientistas de dados no Brasil!</h2>
       
       
        <h2> Já é cadastrado? </h2>
        <form action="autenticador" method="POST">
        	<label> Nome de Usuário </label> </br>
        	<input type="text" name="nome_usuario" /></br></br>
        	<label> Senha </label> </br>
        	<input type="password" name="senha"> </br></br>
        	<input type="submit" value="Entrar" />
       </form>
       </br>
        <h2> Não possui cadastro? Cadastre-se aqui: <a href="UsuarioControllador?acao=cad"> Cadastro Gratuito </a> ou <a href="UsuarioControllador?acao=cadPago"> Cadastro Pago </a> </h2>
    </body>
</html>
