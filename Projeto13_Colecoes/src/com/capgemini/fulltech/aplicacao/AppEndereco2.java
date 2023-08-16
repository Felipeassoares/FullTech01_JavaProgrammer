package com.capgemini.fulltech.aplicacao;

import com.capgemini.fulltech.classes.Endereco;

public class AppEndereco2 {
	public static void main(String[] args) {
		
		try {
			
			Endereco endereco = new Endereco("Av. Rio Branco", 0, "Rio", "21578-001");
			
			System.out.println(endereco.getDados());
			
		} catch (NullPointerException | NumberFormatException e) { // junção de exceções
			
			System.out.println("Erro de referência nula: " + e.getMessage());
			
		} catch (Exception e) {
			System.out.println("Ocorreu um erro geral: " + e.getMessage());
		}
		

	}
}
