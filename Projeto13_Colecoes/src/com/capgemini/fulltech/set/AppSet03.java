package com.capgemini.fulltech.set;

import java.util.Set;
import java.util.TreeSet;

public class AppSet03 {
	public static void main(String[] args) {
		Set<String> cidades = new TreeSet<String>();
		
		// As coleções TreeSet requerem elementos de classes que implementam Comparable
		cidades.add("Blumenau");
		cidades.add("Rio de Janeiro");
		cidades.add("São Paulo");
		cidades.add("Curitiba");
		cidades.add("Porto Feliz");
		cidades.add("Curitiba");
		
		cidades.forEach(s -> System.out.println(s));
	}
}
