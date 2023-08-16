package com.capgemini.fulltech.aplicacao;

import com.capgemini.fulltech.classes.Endereco;

public class AppEndereco {
	public static void main(String[] args) {
		
		Endereco endereco = new Endereco("Av. Rio Branco", 3000, "Rio", "21578-001");
				
		System.out.println(endereco.getDados());
	}
}
