package com.capgemini.fulltech.repeticoes;

import javax.swing.JOptionPane;

public class Exercicio05_AdivinhaNumero {
	public static void main(String[] args) {
		int numero = (int)(Math.random() * 100) + 1;
		
		int max = 100, min = 1, tentativas = 0;
		
		while(true) {
			tentativas++;
			
			String msg = (min == max) ? "Informe o valor " + max : 
				"Informe um valor entre " + min + " e " + max;
			
			int valor = Integer.parseInt(JOptionPane.showInputDialog(msg));
			
			if(valor < min || valor > max)	continue;
			
			if(valor < numero) 
				min = valor + 1;
			else if (valor > numero)
				max = valor - 1;
			else
				break;
		}
		JOptionPane.showMessageDialog(null, "Você acertou em " + tentativas + " tentativas");
	}
}
