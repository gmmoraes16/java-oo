/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ba.livraria.produtos;

/**
 *
 * @author gmmoraes
 */
import br.com.ba.livraria.Autor;

public class LivroFisico extends Livro implements Promocional{

	public LivroFisico(Autor autor) {
		super(autor);
	}

	public double getTaxaImpressao() {
		return this.getValor() * 0.05;
	}
	
	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.3) {
			return false;
		}
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto); 
		return true;
	}
	
}