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
import java.util.HashSet;

public class ConsultaDeDescontos {

	public static void main(String[] args) {
		
		GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();
		
		Double desconto = gerenciador.validaCupom("CUP74");
		
		if(desconto != null){
			System.out.println("Cupom de desconto valido.");
			System.out.println("Valor "+ desconto);
		} else {
			System.out.println("Esse cupom não existe.");
		}
		
		
		HashSet<String> set = new HashSet<String>();
		set.add("Não há repeticão em Conjuntos");
		set.add("Não há repeticão em Conjuntos");
		set.add("Não há repeticão em Conjuntos");
		set.add("Não há repeticão em Conjuntos");
		set.add("Não há repeticão em Conjuntos");
		System.out.println(set.size());
	}
}
