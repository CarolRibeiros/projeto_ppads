/**
 * var obj = document.getElementById('input');	
 */	
function valida() {
	var obj1 = document.getElementById("input1");
	var obj2 = document.getElementById("input2");
	var obj3 = document.getElementById("input3");
	var obj4 = document.getElementById("input4");
	var obj5 = document.getElementById("input5");
	var obj6 = document.getElementById("input6");
	var obj7 = document.getElementById("input7");
	var obj8 = document.getElementById("input8");
	var obj9 = document.getElementById("input9");
	
	if(document.formUsuario.nome_usuario.value == "") {
		obj1.className="vermelho";
		document.formUsuario.nome_usuario.focus();
		return false;
	} 
	else if(document.formUsuario.senha.value == "") {   
		obj2.className="vermelho";
		document.formUsuario.senha.focus(); 
		return false;
	} 
	else if(document.formUsuario.data_nascimento.value == "") {  
		obj3.className="vermelho";
		document.formUsuario.data_nascimento.focus();
		return false;
		}
	else if(document.formUsuario.data_ciencia.value == "") {  
		obj4.className="vermelho";
		document.formUsuario.data_ciencia.focus();
		return false;
		}
	else if(document.formUsuario.estado.value == "") {  
		obj5.className="vermelho";
		document.formUsuario.estado.focus();
		return false;
		}
	else if(document.formUsuario.cidade.value == "") {  
		obj6.className="vermelho";
		document.formUsuario.cidade.focus();
		return false;
		}  
	else if(document.formUsuario.salario.value == "") {  
		obj7.className="vermelho";
		document.formUsuario.salario.focus();
		return false;
		}
	else if(document.formUsuario.nivelInstrucao.value == "") {  
		obj8.className="vermelho";
		document.formUsuario.nivelInstrucao.focus();
		return false;
		}  
	else if(document.formUsuario.empresa.value == "") {  
		obj9.className="vermelho";
		document.formUsuario.empresa.focus();
		return false;
	}
	else {  
		alert("Formulário Cadastrado com Sucesso"); 				   
	}
 }  

function validaPago() {
	var obj1 = document.getElementById("input1");
	var obj2 = document.getElementById("input2");
	var obj3 = document.getElementById("input3");
	var obj4 = document.getElementById("input4");
	var obj5 = document.getElementById("input5");
	var obj6 = document.getElementById("input6");
	var obj7 = document.getElementById("input7");
	var obj8 = document.getElementById("input8");
	var obj9 = document.getElementById("input9");
	var obj10 = document.getElementById("input10");
	var obj11 = document.getElementById("input11");
	var obj12 = document.getElementById("input12");
	var obj13 = document.getElementById("input13");
	
	if(document.formUsuario.nome_usuario.value == "") {
		obj1.className="vermelho";
		document.formUsuario.nome_usuario.focus();
		return false;
	} 
	else if(document.formUsuario.senha.value == "") {   
		obj2.className="vermelho";
		document.formUsuario.senha.focus(); 
		return false;
	} 
	else if(document.formUsuario.data_nascimento.value == "") {  
		obj3.className="vermelho";
		document.formUsuario.data_nascimento.focus();
		return false;
		}
	else if(document.formUsuario.data_ciencia.value == "") {  
		obj4.className="vermelho";
		document.formUsuario.data_ciencia.focus();
		return false;
		}
	else if(document.formUsuario.estado.value == "") {  
		obj5.className="vermelho";
		document.formUsuario.estado.focus();
		return false;
		}
	else if(document.formUsuario.cidade.value == "") {  
		obj6.className="vermelho";
		document.formUsuario.cidade.focus();
		return false;
		}  
	else if(document.formUsuario.salario.value == "") {  
		obj7.className="vermelho";
		document.formUsuario.salario.focus();
		return false;
		}
	else if(document.formUsuario.nivelInstrucao.value == "") {  
		obj8.className="vermelho";
		document.formUsuario.nivelInstrucao.focus();
		return false;
		}  
	else if(document.formUsuario.empresa.value == "") {  
		obj9.className="vermelho";
		document.formUsuario.empresa.focus();
		return false;
	}
	else if(document.formUsuario.num_cartao.value == "") {  
		obj10.className="vermelho";
		document.formUsuario.num_cartao.focus();
		return false;
	}
	else if(document.formUsuario.nome_resp.value == "") {  
		obj11.className="vermelho";
		document.formUsuario.nome_resp.focus();
		return false;
	}
	else if(document.formUsuario.dt_validade.value == "") {  
		obj12.className="vermelho";
		document.formUsuario.dt_validade.focus();
		return false;
	}
	else if(document.formUsuario.cvc.value == "") {  
		obj13.className="vermelho";
		document.formUsuario.cvc.focus();
		return false;
	}
	
}