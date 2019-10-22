package br.com.projeto.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.bens.Usuario;
import br.com.projeto.redesocial.UsuarioDAO;

/**
 * Servlet implementation class UsuarioControllador
 */
@WebServlet("/UsuarioControllador")
public class UsuarioControllador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioControllador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Usuario usu = new Usuario();
		String acao = request.getParameter("acao");
		UsuarioDAO usuDAO = new UsuarioDAO();
		
		if(acao != null && acao.contentEquals("lis")) {
			List<Usuario> lista = usuDAO.buscaTodos(usu);
			request.setAttribute("lista", lista);
			RequestDispatcher saida = request.getRequestDispatcher("listaUsuario.jsp");
			saida.forward(request, response);
		}
		else if(acao != null && acao.contentEquals("alt")) {
				String nome_usuario = request.getParameter("nome_usuario");
				Usuario usuario = usuDAO.buscaporId(nome_usuario);
				request.setAttribute("nome_usuario", usuario);
				request.getRequestDispatcher("AlteraCadastro.jsp").forward(request, response);
		}
		else if(acao != null && acao.contentEquals("cad")) {
			RequestDispatcher saida = request.getRequestDispatcher("CadastroGratuito.jsp");
			saida.forward(request, response);
		}
		else if(acao != null && acao.contentEquals("cadPago")) {
			RequestDispatcher saida = request.getRequestDispatcher("CadastroPago.jsp");
			saida.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String snome_usuario = request.getParameter("nome_usuario");
		String ssenha = request.getParameter("senha");
		String sdata_nascimento = request.getParameter("data_nascimento");
		String sdata_ciencia = request.getParameter("data_ciencia");
		String sestado = request.getParameter("estado");
		String scidade = request.getParameter("cidade");
		String ssalario = request.getParameter("salario");
		String snivelInstrucao = request.getParameter("nivelInstrucao");
		String sempresa = request.getParameter("empresa");
		
		Usuario usuario = new Usuario();
		usuario.setNome_usuario(snome_usuario);
		usuario.setSenha(ssenha);
		usuario.setData_nascimento(sdata_nascimento);
		usuario.setData_ciencia(sdata_ciencia);
		usuario.setEstado(sestado);
		usuario.setCidade(scidade);
		usuario.setSalario(ssalario);
		usuario.setNivelInstrucao(snivelInstrucao);
		usuario.setEmpresa(sempresa);
		
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.update(usuario);
		PrintWriter out = response.getWriter();
		response.sendRedirect("UsuarioControllador?acao=lis");
	}

}
