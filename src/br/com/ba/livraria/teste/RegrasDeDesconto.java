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
import br.com.ba.livraria.Autor;
import br.com.ba.livraria.produtos.Livro;
import br.com.ba.livraria.produtos.MiniLivro;

public class RegrasDeDesconto {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Gelson Moraes");
		
		Livro livro = new MiniLivro(autor);
		livro.setValor(39.90);
		
//		if (!livro.aplicaDescontoDe(0.3)){
//			System.out.println("Desconto do livro não pode ser maior do que 30%");
//		} else {
//			System.out.println("Valor do livro com desconto: " + livro.getValor());
//		}
		
//		Ebook ebook = new Ebook(autor);
//		ebook.setValor(29.90);
//		
//		if (!ebook.aplicaDescontoDe(0.15)){
//			System.out.println("Desconto no ebook não pode ser maior do que 15%");
//		} else {
//			System.out.println("Valor de ebook com desconto: " + ebook.getValor());
//		}
	}
}