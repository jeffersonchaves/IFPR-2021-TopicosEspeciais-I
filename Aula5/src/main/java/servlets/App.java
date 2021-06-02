package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.Livro;

@WebServlet("/app")
public class App extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Aplicacao
		ServletContext contexto = request.getServletContext();
		contexto.setAttribute("sagacidade", "Capacidade para depreender, aprender ou interpretar algo através de indicações simples: a sagacidade dos cientistas.");
		
		//Bean
		Livro l1 = new Livro();
		l1.setTitulo("Sobre a escrita");
		l1.setAno(2015);
		l1.setAutor("Stephen King");
		
		request.setAttribute("livro1", l1);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
		
		//resp.sendRedirect("index.jsp");
		
	}
	
}
