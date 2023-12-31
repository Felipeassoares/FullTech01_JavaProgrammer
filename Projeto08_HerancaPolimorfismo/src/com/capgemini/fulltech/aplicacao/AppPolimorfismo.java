package com.capgemini.fulltech.aplicacao;

import javax.swing.JOptionPane;

import com.capgemini.fulltech.classes.Aluno;
import com.capgemini.fulltech.classes.Curso;
import com.capgemini.fulltech.classes.Funcionario;
import com.capgemini.fulltech.classes.Pessoa;
import com.capgemini.fulltech.enumeracoes.Sexos;

public class AppPolimorfismo {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Maria", 30, Sexos.FEMININO);
		Pessoa p2 = new Funcionario(
			"Juliano", 40, Sexos.MASCULINO, "coordenador", 20000);
		
		// desejamos alterar o nome do funcionario
		p2.setNome("Juliano Silva");
		
		// desejamos alterar o cargo do funcionario
		
		//Funcionario func = (Funcionario)p2;
		//func.setCargo("Gerente");
		
	
		
		if(p2 instanceof Funcionario) {
			((Funcionario)p2).setCargo("Gerente");
			JOptionPane.showMessageDialog(null, p2.getDados());	
		}

		
		p2 = p1;		
		JOptionPane.showMessageDialog(null, p2.getDados());
		
		
		p2 = new Aluno("Gerson", 50, Sexos.MASCULINO, 1000);
		// desejamos adicionar um curso para o aluno
		if(p2 instanceof Aluno) {
			((Aluno) p2).setCurso(new Curso(110, "Java", 100, 1200.0));
		}
		
		JOptionPane.showMessageDialog(null, p2.getDados());
	}
}
