package controllers;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.Autor;
import modelos.Livro;

@WebServlet("")
public class App  extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Livro> livros = new ArrayList<Livro>();
		
		Date date = null;
		Livro l1 = new Livro();
		
		l1.setId(Long.valueOf("1"));
		l1.setTitulo("Cem anos de solidão");
		l1.setGenero("Romance");
		l1.setPreco(88.90);
		l1.setPaginas(432);
		
		//tudo que vem é sempre string
		//o formato é diferente
		
		try {
		
			date = new SimpleDateFormat("dd/mm/YYYY").parse("01/01/1998");
			l1.setDataPublicacao(date);
		
		} catch (ParseException e) {
			
			throw new IllegalArgumentException("a data não está correta");

		}
		
		Autor a1 = new Autor();
		a1.setNome("Gabriel García Márquez");
		
		l1.setAutor(a1);
		
		System.out.println(l1);
		
		livros.add(l1);
		
		
		req.setAttribute("attrLivros",livros);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
		
		dispatcher.forward(req, resp);
		
	
	}
	
	
	
}
