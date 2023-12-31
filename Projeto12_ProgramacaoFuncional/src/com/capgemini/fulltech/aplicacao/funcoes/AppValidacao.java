package com.capgemini.fulltech.aplicacao.funcoes;

import com.capgemini.fulltech.classes.Aluno;
import com.capgemini.fulltech.classes.Curso;
import com.capgemini.fulltech.classes.DocumentoCpf;
import com.capgemini.fulltech.classes.Funcionario;
import com.capgemini.fulltech.classes.Pessoa;
import com.capgemini.fulltech.enumeracoes.Sexos;
import com.capgemini.fulltech.interfaces.funcoes.Validacao;

public class AppValidacao {
	public static void main(String[] args) {
		
		Validacao<Pessoa>      v1 = p -> p.getIdade() >= 18; 
		Validacao<Aluno>       v2 = p -> p.getCurso().getDescricao().contains("JAVA");
		Validacao<Funcionario> v3 = p -> p.getSalario() > 10000;
		
		try {
			Funcionario f = new Funcionario(
				"Ismael", 30, Sexos.MASCULINO, "Professor", new DocumentoCpf("12345678901"), 5000);
			Aluno a = new Aluno("Ana Paula", 20, Sexos.FEMININO, 1100, new Curso(10, "JAVA", 60, 0));
			
			System.out.println("v1 (f): " + v1.validar(f));
			System.out.println("v1 (a): " + v1.validar(a));
			System.out.println("v2: " + v2.validar(a));
			System.out.println("v3: " + v3.validar(f));
			
		} catch (Exception e) {
			
		}
	}
}
