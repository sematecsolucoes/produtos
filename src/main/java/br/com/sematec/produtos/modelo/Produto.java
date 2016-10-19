package br.com.sematec.produtos.modelo;


public class Produto {
	private Long id;
	private String nome;
	private String descricao;
	private Double preco;
	private boolean usado;

	public Produto() {
		super();
	}

	public Produto(String nome, String descricao, Double preco, boolean usado) {
		this();
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.usado = usado;
	}

	public String getDescricao() {
		return descricao;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Double getPreco() {
		return preco;
	}

	public boolean isUsado() {
		return usado;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public void setUsado(boolean usado) {
		this.usado = usado;
	}
}
