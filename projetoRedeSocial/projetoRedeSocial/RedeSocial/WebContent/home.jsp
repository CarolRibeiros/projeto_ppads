<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="estilo.css"/>
<title> Rede+Cientista </title>
</head>
<body>
<h1> @Fulano </h1>
    <h1> Seja bem vindo(a) a uma rede social dedicada a você! </h1>
    <aside>
    <figure>
        <img src="image/image.jpeg" alt="foto_perfil" width="250px" height="250px">	
        <figcaption>Adicione sua foto de perfil!</figcaption>
    </figure>
    <section>
        <h2> Recomendações: </h2>
        <button name="button"> Recomendar Perfil </button>
    </section>    
    </aside>    
    <nav>
      <ul>
        <li><a href="home.jsp">Página Inicial</a></li>
        <li><a href="UsuarioControllador?acao=lis">Amigos</a></li>
        <li><a href="UsuarioControllador?acao=alt">Atualizar Dados</a></li>
        <li><a href="#"> Sair </a></li>
      </ul>
    </nav>
    <section>
        <h1> Publicações </h1>
    </section>
</body>
</html>