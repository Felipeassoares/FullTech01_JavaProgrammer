package com.capgemini.fulltech.comandoif;

import javax.swing.JOptionPane;

public class Exercicio02_CaixaEletronico {
	public static void main(String[] args) {
		/*
		 * Um caixa eletronico possui as seguintes cédulas:
		 * 50, 20, 10 e 5 reais.
		 * 
		 * Determinar a quantidade de cada cédula dado o valor de um saque.
		 */
		
		// obtendo o valor do saque
		double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Valor do saque:"));
		
		// fazendo o cast (typecast) para inteiro - coerção
		int valor = (int)valorSaque;
		
		// verificando se o valor é múltiplo de 5
		if(valor % 5 != 0) {
			throw new ArithmeticException("O valor do saque deve ser múltiplo de 5!!");
		}
		
		// definindo variáveis para armazenar as quantidades de cédulas
		int q50, q20, q10, q5;
		q50 = q20 = q10 = q5 = 0;
		
		q50 = valor / 50;
		valor %= 50;	// operador módulo ou resto da divisão inteira
		
		q20 = valor / 20;
		valor %= 20;
		
		q10 = valor / 10;
		valor %= 10;
		
		q5 = valor / 5;
		
		String resposta = "Valor do saque: " + valorSaque +
				"\nNotas de 50: " + q50 +
				"\nNotas de 20: " + q20 +
				"\nNotas de 10: " + q10 +
				"\nNotas de  5: " + q5;
		
		JOptionPane.showMessageDialog(null, resposta);
	}
}








