package modelos;

import java.io.Serializable;

public class Livro implements Serializable {
	
	private String titulo;
	private Integer ano;
	private String autor;

	public Livro() {}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		
		if (ano < 0) {
			throw new IllegalArgumentException("o ano não pode ser anterior a zero");
		}
		
		this.ano = ano;
	}

	public String getAutor() {
		return autor.toUpperCase();
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Livro [ titulo=" + titulo + ", ano=" + ano + ", autor=" + autor + " ]";
	}
	
	

}
