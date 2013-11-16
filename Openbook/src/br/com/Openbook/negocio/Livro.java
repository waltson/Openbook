package br.com.Openbook.negocio;

public class Livro {

	private String nomeLivro;
	private String isbn;
	private String edicao;
	private String idioma;
	private String numerosPaginas;

	public Livro() {
		super();
	}

	public Livro(String nomeLivro, String isbn, String edicao, String idioma,
			String numerosPaginas) {
		super();
		this.nomeLivro = nomeLivro;
		this.isbn = isbn;
		this.edicao = edicao;
		this.idioma = idioma;
		this.numerosPaginas = numerosPaginas;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getNumerosPaginas() {
		return numerosPaginas;
	}

	public void setNumerosPaginas(String numerosPaginas) {
		this.numerosPaginas = numerosPaginas;
	}

}