package com.capgemini.fulltech.interfaces;

public interface Figura {
	
	// por definição, atributos de interfaces são públicos, estáticos e
	// constantes (final)
	String curso = "Full Tech";
	
	// por definição, métodos de interfaces são publicos e abstratos
	double calcularArea();
	
	default String mostrarFigura() {
		String resultado = "Classe da figura: " + this.getClass().getSimpleName()
				+ "\nÁrea da figura: " + this.calcularArea();
		return resultado;
	}
}
