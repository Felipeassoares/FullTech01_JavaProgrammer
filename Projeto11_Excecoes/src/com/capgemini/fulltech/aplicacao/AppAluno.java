package com.capgemini.fulltech.aplicacao;

import javax.swing.JOptionPane;

import com.capgemini.fulltech.classes.Aluno;
import com.capgemini.fulltech.classes.Curso;
import com.capgemini.fulltech.enumeracoes.Sexos;

public class AppAluno {
	public static void main(String[] args) {
		
		try {
			Curso[] cursos = { 
				new Curso(10, "HTML", 20),
				new Curso(20, "Javascript", 40, 500),
				new Curso(30, "Asp.Net Core", 40, 1200),
				new Curso(40, "SQL Server", 60, 2500)
			};
			
			// solicitando dados do aluno para o usuário
			String nome = JOptionPane.showInputDialog("Informe seu nome:");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
			
			Sexos sexo = (Sexos)JOptionPane.showInputDialog(
					null, 
					"Selecione o sexo", 
					"Sexo", 
					JOptionPane.INFORMATION_MESSAGE, 
					null, 
					Sexos.values(), 
					null);
			
			int matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe a matrícula"));
			Curso curso = (Curso)JOptionPane.showInputDialog(
					null, 
					"Qual seu curso desejado?", 
					"Cursos", 
					JOptionPane.QUESTION_MESSAGE, 
					null, 
					cursos, 
					null);
			Aluno aluno = new Aluno(nome, idade, sexo, matricula, curso);
			JOptionPane.showMessageDialog(null, aluno.getDados());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
