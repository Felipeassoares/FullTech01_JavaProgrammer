package com.capgemini.fulltech.aplicacao;

import javax.swing.JOptionPane;

import com.capgemini.fulltech.figuras.Circulo;
import com.capgemini.fulltech.figuras.Figura;
import com.capgemini.fulltech.figuras.Retangulo;

public class AppFigura {
	public static void main(String[] args) {
		Retangulo r1 = new Retangulo(2, 3);
		Circulo c1   = new Circulo(4);
		
		Figura r2    = new Retangulo(3, 3);
		Figura c2    = new Circulo(1);
		
		mostrarFigura(r1);
		mostrarFigura(c1);
		mostrarFigura(r2);
		mostrarFigura(c2);
	}
	
	private static void mostrarFigura(Figura figura) {
		
		String resultado = "Classe da figura: " + figura.getClass().getSimpleName()
				+ "\nÁrea da figura: " + figura.calcularArea();
		JOptionPane.showMessageDialog(null, resultado);
		
	}
}
