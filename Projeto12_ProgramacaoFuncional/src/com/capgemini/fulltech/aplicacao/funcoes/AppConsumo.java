package com.capgemini.fulltech.aplicacao.funcoes;

import com.capgemini.fulltech.classes.Curso;
import com.capgemini.fulltech.interfaces.funcoes.Consumo;

public class AppConsumo {
	public static void main(String[] args) {
		
		Consumo<String> c1 = s -> s.toUpperCase();
		
		Consumo<Integer> c2 = s -> "Valor: " + s; 
		
		Consumo<Curso> c3 = s -> s.getDados();
		
		System.out.println("c1: " + c1.executar("Interface Genérica"));
		//System.out.println("c1: " + c1.executar(new Endereco("Rua Bahia", 100, "São Paulo", "04200-000")));
		
		System.out.println("c2: " + c2.executar(1234));
		
		try {
			System.out.println("c3: \n" + c3.executar(new Curso(30, "Culinaria", 40, 500)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
