package com.capgemini.fulltech.aplicacao;

import com.capgemini.fulltech.metodos.Metodos;

public class AppMetodos {
	public static void main(String[] args) {
		
		double[] valores = { 2.3, 4.5, 7.8, 9.0 };
		
		// metodo somarElementos(): duas formas de utilização do valor de retorno
		double soma = Metodos.somarElementos(valores);
		System.out.println("Soma: " + soma);
		System.out.println("Soma: " + Metodos.somarElementos(valores));
		System.out.println("-".repeat(30));
		
		
		// método trocarElemento()
		Metodos.trocarElementos(valores);
		for (double num : valores) {
			System.out.println(num);
		}
		System.out.println("-".repeat(30));
		
		// método trocarReornarElemento()
		double[] troca = Metodos.trocarRetornarElementos(valores);
		System.out.println("Array valores (original):");
		for (double num : valores) {
			System.out.println(num);
		}		
		
		System.out.println("Array troca (retornado pelo metodo):");
		for (double num : troca) {
			System.out.println(num);
		}		
		
		System.out.println("-".repeat(30));
		// método calcularMedia()
		System.out.println("Média 1: " + Metodos.calcularMedia(2, new double[] { 3 }));
		System.out.println("Média 2: " + Metodos.calcularMedia(2, new double[] {3, 8, 7, 9}));
		System.out.println("Média 3: " + Metodos.calcularMedia(valores));
		System.out.println("Média 4: " + Metodos.calcularMedia());
		
		System.out.println("-".repeat(30));
		
		// metodo trocarElementos() revisado
		Metodos.trocarElementos(null);		
	}
}
