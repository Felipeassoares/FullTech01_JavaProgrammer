package com.capgemini.fulltech.aplicacao;

import com.capgemini.fulltech.classes.Endereco;

public class AppEndereco1 {
	public static void main(String[] args) {
		
		try {
			
			Endereco endereco = new Endereco("Av. Rio Branco", 3000, "Rio", "21578-001");
			
			System.out.println(endereco.getDados());
			
		} catch (Exception e) {
			
			System.out.println("Erro: " + e.getMessage());
			
		} 
		

	}
}
