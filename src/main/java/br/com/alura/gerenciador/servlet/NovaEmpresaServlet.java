	package br.com.alura.gerenciador.servlet;
	
	import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
	import jakarta.servlet.annotation.WebServlet;
	import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;
	import java.io.IOException;
	import java.io.PrintWriter;
	
	/**
	 * Servlet implementation class NovaEmpresaServlet
	 */
	public class NovaEmpresaServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;
	
		/**
		 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub	
			System.out.println("REGISTERING");
			String nomeEmpresa = request.getParameter("nome");
			Empresa empresa = new Empresa();
			empresa.setNome(nomeEmpresa);
			Banco banco = new Banco();
			banco.adiciona(empresa);
			
			RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
			request.setAttribute("empresa", empresa.getNome());
			rd.forward(request, response);
		}
	}
