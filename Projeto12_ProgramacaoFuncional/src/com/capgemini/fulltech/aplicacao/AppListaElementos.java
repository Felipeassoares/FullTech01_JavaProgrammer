package com.capgemini.fulltech.aplicacao;

import com.capgemini.fulltech.classes.Aluno;
import com.capgemini.fulltech.classes.DocumentoCpf;
import com.capgemini.fulltech.classes.Funcionario;
import com.capgemini.fulltech.classes.ListaElementos;
import com.capgemini.fulltech.classes.Pessoa;
import com.capgemini.fulltech.enumeracoes.Sexos;

public class AppListaElementos {
	public static void main(String[] args) {
		
		String[] nomes = { "Janete", "Antonieti", "Mirosmar", "Riedson", "Clara", "Ramiro" };
		ListaElementos<String> lista = new ListaElementos<String>(nomes);
		
		// Buscando nomes de acordo com critérios pré estabelecidos
		String nome = lista.buscar(p -> p.length() == 7);
		
		System.out.println(nome);
		System.out.println("-".repeat(20));
		
		lista.pesquisar(p -> System.out.println(p));
		
		
		
		System.out.println("-".repeat(20));
		Pessoa[] pessoas = {
			new Aluno("Mirosmar", 40, Sexos.MASCULINO, 100),
			new Aluno("Antonieti", 30, Sexos.FEMININO, 200),
			new Funcionario(
				"Ramiro", 45, Sexos.MASCULINO, "Motorista", new DocumentoCpf("12345678901"), 4500)
		};
		ListaElementos<Pessoa> listaPessoas = new ListaElementos<Pessoa>(pessoas);
		
		Pessoa pessoa = listaPessoas.buscar(p -> p.getIdade() > 45);
		if(pessoa != null) {
			System.out.println(pessoa.getDados());
		} else {
			System.out.println("Nenhuma pessoa com as condições especificadas foi localizada.");
		}
	}
}
