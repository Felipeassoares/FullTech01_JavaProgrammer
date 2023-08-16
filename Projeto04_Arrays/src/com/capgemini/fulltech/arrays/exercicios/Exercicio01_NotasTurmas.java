package com.capgemini.fulltech.arrays.exercicios;

import javax.swing.JOptionPane;

public class Exercicio01_NotasTurmas {
	public static void main(String[] args) {
		/*
		 * Escrever um array bidimensional representando n turmas, onde cada turma possui
		 * uma certa quantidade de alunos (notas).
		 * 
		 * A quantidade de turmas, de alunos por turma e o valor de cada nota deve
		 * ser fornecido como dado de entrada.
		 * 
		 * Em seguida, apresentar:
		 * - as notas pot turma
		 * - a média por turma
		 */
		
		int nturmas = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de turmas:"));		
		double[][] turmas = new double[nturmas][];
		
		for (int i = 0; i < turmas.length; i++) {
			int nalunos = Integer.parseInt(JOptionPane.showInputDialog("Nº de alunos na turma " + (i+1)));
			turmas[i] = new double[nalunos];
			for (int j = 0; j < turmas[i].length; j++) {
				turmas[i][j] = Double.parseDouble(
					JOptionPane.showInputDialog(String.format("Nota %d, turma %d", j+1, i+1)));
			}
		}
		
		// Apresentando os resultados:
		for (int i = 0; i < turmas.length; i++) {
			System.out.print("Turma " + (i+1) + ": ");
			double soma = 0;
			for (int j = 0; j < turmas[i].length; j++) {
				System.out.print(turmas[i][j] + " ");
				soma += turmas[i][j];
			}
			System.out.println(" - Média: " + soma / turmas[i].length);
		}		
	}
}
