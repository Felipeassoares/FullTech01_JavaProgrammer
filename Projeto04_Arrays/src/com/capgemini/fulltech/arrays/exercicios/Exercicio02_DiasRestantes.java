package com.capgemini.fulltech.arrays.exercicios;

import javax.swing.JOptionPane;

public class Exercicio02_DiasRestantes {
	public static void main(String[] args) {
		/*
		 * Neste exercicio, o usuário informa:
		 * - o dia
		 * - o mês
		 * - o ano
		 * 
		 * Com estas informações, determinar quantos 
		 * dias restam para terminar o ano.
		 */
		
		
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano:"));
		int[] meses = {31, ano % 4 == 0 ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês (1 a 12):"));
		if(mes < 1 || mes > 12) {
			JOptionPane.showMessageDialog(null, "Mês inválido");
			return;
		}
		
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia:"));
		if(dia < 1 || dia > meses[mes - 1]) {
			JOptionPane.showMessageDialog(null, "Dia inválido para o mês informado!");
			return;
		}
		
		int diasRestantes = meses[mes - 1] - dia;
		for (int i = mes; i < meses.length; i++) {
			diasRestantes += meses[i];
		}
		
		JOptionPane.showMessageDialog(null, String.format("Restam %d dias.", diasRestantes));
	}
}
