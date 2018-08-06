/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ba.livraria.exception;

/**
 *
 * @author gmmoraes
 */
public class AutorNuloException extends RuntimeException{

	public AutorNuloException(String mensagem) {
		super(mensagem);
	}
}