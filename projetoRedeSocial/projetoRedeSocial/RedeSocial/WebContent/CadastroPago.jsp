<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Cadastro Pago </title>
<style type="text/css">
	.cor {
	border-color:#000000;
	}
	.vermelho {
		border-color: #ff0000;
	}
</style>
</head>
<body>
<h1> Rede + Cientistas - Cadastro Pago </h1>
    <article>
        <form name="formUsuario" action="SalvoCadastroPago.jsp" method="POST" onSubmit="return validaPago();">
            <fieldset>
                <legend>Cadastre-se:</legend> </br>
                    <label> Nome de Usuário </label> </br>
                    <input id="input1" class="cor" type="text" name="nome_usuario" /> </br>
                    <label> Senha: </label> </br>
                    <input  id="input2" class="cor" type="password" name="senha"><br>
                    <label> Data de Nascimento </label> </br>
                    <input id="input3" class="cor" type="text" name="data_nascimento"> <br>
                    <label> Data de Início em Ciência de Dados </label> </br>
                    <input id="input4" class="cor" type="text" name="data_ciencia"> <br>
                    <label> Estado </label> </br>
                    <input id="input5" class="cor" type="text" name="estado"> </br>
                    <label> Cidade </label> </br>
                    <input id="input6" class="cor" type="text" name="cidade"> </br>
                    <label> Salario </label> </br>
                    <input id="input7" class="cor" type="number" name="salario"> </br>
                    <label> Nível de Instrução </label> </br>
                    <input id="input8" class="cor" type="text" name="nivelInstrucao"> </br>
                    <label> Empresa Atual </label> </br>
                    <input id="input9" class="cor" type="text" name="empresa"> </br></br>
            </fieldset>
            <fieldset>
            	<h1> Informações de Pagamento </h1>
            	<label> Número do cartão </label> </br>
                <input id="input10" class="cor" type="text" name="num_cartao"> </br>
                <label> Nome do responsável </label> </br>
                <input id="input11" class="cor" type="text" name="nome_resp"> </br></br>
                <label> Data de validade </label> </br>
                <input id="input12" class="cor" type="text" name="dt_validade"> </br>
            	<label> CVC </label> </br>
                <input id="input13" class="cor" type="text" name="cvc"> </br></br>	
            	<input type="submit" value="Enviar" onclick="validaPago();" />
            </fieldset>
         </form>
         
	</article>

</body>
</html>