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

public class Ebook extends Livro implements Promocional{

	private String waterMark;

	public Ebook(Autor autor) {
		super(autor);//o Super é para delegar a responsabilidade para a superclasse que já tem esse comportamente bem definido.
	}
	
	@Override //Usando @Override, o compilador nos ajudará a validar que esse método é realmente uma reescrita.
	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.15) {
			return false;
		}
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		System.out.println("aplicando desconto no Ebook");
		return true;
	}
	
	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	
	public String getWaterMark() {
		return waterMark;
	}
	
	@Override
	public String toString() {
		return "Eu sou um Ebook";
	}
}
