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
import br.com.ba.livraria.produtos.LivroFisico;

public class CadastroDeLivros {
	
	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.setNome("Beatriz Araújo");
		autor.setEmail("ga@gmail.com");
		autor.setCpf("123.456.789.10");
		
		Livro livro = new LivroFisico(autor);
		livro.setNome("Java 8 Prático");
		livro.setDescricao("Novos recursos da linguagem");
		livro.setValor(59.90);
		livro.setIsbn("978-85-66250-46-6");
		
		livro.mostrarDetalhes();
		
//		Autor outroAutor = new Autor();
//		outroAutor.setNome("Gelson Moraes");
//		outroAutor.setEmail("gmmoraesbr@gmail.com");
//		outroAutor.setCpf("123.456.789.10");
//		
//		Livro outroLivro = new LivroFisico(outroAutor);
//		outroLivro.setNome("Lógica de Programação");
//		outroLivro.setDescricao("Crie seus primeiros programas");
//		outroLivro.setValor(59.90);
//		outroLivro.setIsbn("978-85-66250-22-0");
//		
//		outroLivro.mostrarDetalhes();
		
	}
}