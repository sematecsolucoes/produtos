package br.com.sematec.produtos.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.sematec.produtos.modelo.Produto;

public class ProdutoDAO {
	private static void geraIdEAdiciona(Produto p) {
		long id = PRODUTOS.size() + 1l;
		p.setId(id);
		PRODUTOS.put(id, p);
	}

	private final static Map<Long, Produto> PRODUTOS = new HashMap<>();
	static {
		geraIdEAdiciona(new Produto("Caneta", "caneta", 5.5d, false));
		geraIdEAdiciona(new Produto("Livro", "livro", 86.99d, false));
		geraIdEAdiciona(new Produto("Geladeira", "Geladeira", 500.0d, true));
		geraIdEAdiciona(new Produto("Fogão", "Brastemp", 250.4d, false));
		geraIdEAdiciona(new Produto("XBOX", "Videogame da Microsoft", 150.0d, true));
		geraIdEAdiciona(new Produto("Celular", "Samsung Novo ", 1500.0d, false));
	}

	public void adiciona(Produto p) {
		geraIdEAdiciona(p);
	}

	public void atualiza(Produto p) {
		PRODUTOS.put(p.getId(), p);
	}

	public Produto find(Long id) {
		return PRODUTOS.get(id);
	}

	public List<Produto> lista() {
		return new ArrayList<Produto>(PRODUTOS.values());
	}

	public void remove(Long id) {
		PRODUTOS.remove(id);
	}

	public void remove(Produto p) {
		remove(p.getId());
	}
}