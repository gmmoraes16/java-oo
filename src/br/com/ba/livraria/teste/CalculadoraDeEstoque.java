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
public class CalculadoraDeEstoque {
	public static void main(String[] args) {
		double soma = 0;
		
		for ( double i = 0; i < 35; i ++ ) {
			soma += 59.90;
		}
		
		System.out.println("O total em estoque é "+ soma);
		
		if ( soma < 150 ) {
			System.out.println("Seu estoque está muito baixo!");	
		} else if ( soma >= 2000 ){
			System.out.println("Seu estoque está muito alto!");
		} else {
			System.out.println("Seu estoque está bom!");
		}
	}
}
