package modelos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Livro implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Date dataPublicacao;
	private String titulo;
	private String genero;
	private Double preco;
	private Integer paginas; 
	
	private List<Autor> autores = new ArrayList<Autor>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		
		if (titulo.isEmpty() || titulo.length() < 2) {
			throw new IllegalArgumentException("o título não pode ser vazio");
		}
		
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	
	public void setAutor(Autor autor) {
		this.autores.add(autor);
	}

	@Override
	public String toString() {
		return "Livro [id=" + id + ", dataPublicacao=" + dataPublicacao + ", titulo=" + titulo + ", genero=" + genero
				+ ", preco=" + preco + ", paginas=" + paginas + ", autores=" + autores + "]";
	}
	
}
