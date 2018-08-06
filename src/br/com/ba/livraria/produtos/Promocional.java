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
@FunctionalInterface //quando se tem um único método abstrato
public interface Promocional {

	boolean aplicaDescontoDe(double porcentagem); //método abstrato
	
	//o default começou a partir do java 1.8, ele já leva automaticamente este método para class filha
	default boolean aplicaDescontoDe10Porcento() {
		return aplicaDescontoDe(0.1);
	}
}