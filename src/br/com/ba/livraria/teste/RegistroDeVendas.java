/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ba.livraria.teste;

/**
 *
 * @author gmmoraes
 */
import java.util.List;

import br.com.ba.livraria.Autor;
import br.com.ba.livraria.produtos.CarrinhoDeCompras;
import br.com.ba.livraria.produtos.Ebook;
import br.com.ba.livraria.produtos.LivroFisico;
import br.com.ba.livraria.produtos.Produto;

public class RegistroDeVendas {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Gelson Moraes");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Test-Driven Development");
		fisico.setValor(59.90);
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test-Driven Development");
		ebook.setValor(29.90);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		if ( fisico.aplicaDescontoDe10Porcento() ) {
			System.out.println("Valor agora é " + fisico.getValor() );
		}
		
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);
		
		System.out.println("Total: " + carrinho.getTotal());
		
		List<Produto> produtos = carrinho.getProdutos();
		
		for (Produto produto : produtos) {
			System.out.println(produto.getValor());
		}
	}

}