package com.capgemini.fulltech.metodos;

public class Metodos {

	// definindo um método que recebe como parametro um array de numeros reais
	// e mostre o valor da soma dos elementos.
	public static double somarElementos(double[] numeros) {
		double soma = 0;
		for (double item : numeros) {
			soma += item;
		}
		return soma;
	}
	
	// método que recebe um array de numeros reais e efetua a troca entre o primeiro
	// e o último elemento.
	public static void trocarElementos(double[] numeros) {
		
		if(numeros == null || numeros.length < 2) {		
			
			throw new ArithmeticException("A lista deve ter pelo menos 2 elementos");
		}
		double aux = numeros[0];
		numeros[0] = numeros[numeros.length - 1];
		numeros[numeros.length - 1] = aux;
	}
	

	// método que recebe um array de numeros reais e efetua a troca entre o primeiro
	// e o último elemento.
	public static double[] trocarRetornarElementos(double[] numeros) {
		
		if(numeros.length < 2) {			
			throw new ArithmeticException("A lista deve ter pelo menos 2 elementos");
		}
		
		// clonando o array
		double[] copia = numeros.clone();
		
		double aux = copia[0];
		copia[0] = copia[copia.length - 1];
		copia[copia.length - 1] = aux;
		
		return copia;
	}	
	
	// método que recebe uma quantidade variável de numeros reais e retorna a média entre eles
	// Observações:
	// 1. Cada método deve ter somente um parametro varargs
	// 2. Se o método tiver mais parametros, sendo um deles varargs, este deve ser o último
	public static double calcularMedia(double... numeros) {
		double soma = 0;
		for (double num : numeros) {
			soma += num;
		}
		return numeros.length > 0 ? soma / numeros.length : 0;
	}

	// Versão sobrecarregada do método (overloading)	
	public static double calcularMedia(double valor, double... numeros) {
		double soma = valor;
		for (double num : numeros) {
			soma += num;
		}
		return numeros.length > 0 ? soma / (numeros.length + 1) : soma;
	}	
	
}
