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
public interface Produto extends Comparable<Produto> {
	
	double getValor();

}