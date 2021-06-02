package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("")
public class App extends HttpServlet {

	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext contexto = request.getServletContext();
		
		PrintWriter out = response.getWriter();
		
		String mensagemDaServlet = "bem vindo";
		
		//out.print("<html><body><h1>" + mensagem + "</h1></body></html>");
		
		contexto.setAttribute("msg", mensagemDaServlet);
		
		response.sendRedirect("index.jsp");
		
	}

}
