package logica.exercicios.aula08;

import java.util.Calendar;

public class Exericicio02 {

	// ▪ Preencher uma matriz 4x5 de números inteiros com os números de 1 até 20.
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		if(c.get(Calendar.DAY_OF_WEEK) == 3) {
		 System.out.println("Hoje tem feira na rua!");
		}

	}
	
}