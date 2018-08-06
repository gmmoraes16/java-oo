/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ba.livraria;

/**
 *
 * @author gmmoraes
 */
import java.util.Comparator;

import br.com.ba.livraria.produtos.Livro;

public class ComparadorPorNome implements Comparator<Livro>{

	@Override
	public int compare(Livro l1, Livro l2) {
		return l1.getNome().compareTo(l2.getNome());
	}
}