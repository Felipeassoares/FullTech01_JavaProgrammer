package com.capgemini.fulltech.repeticoes;

import javax.swing.JOptionPane;

public class Exercicio04_MostrarNumeros {
	public static void main(String[] args) {
		/*
		 * neste programa, o usuário fornece uma sequencia de numeros inteiros.
		 * Quando o usuário informar 0, o programa termina.
		 * Se o usuário informar um valor negativo, este é ignorado
		 * Caso contrário, o valor é exibido
		 * 
		 */
		while(true) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número:"));			
			if(numero == 0) {
				break;				
			}
			if(numero < 0) {
				continue;
			}
			
			System.out.println(numero);
		}
		
		System.out.println("FIM DO PROGRAMA");
	}
}
