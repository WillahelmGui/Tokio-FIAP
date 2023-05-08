package logica.exercicios.aula09;

import java.util.Arrays;

public class Exercicio03 {
	public static void main(String[] args) {
		int[] v = new int[recebeNumero()];
		int media = 0, somaMedia = 0;
		for(int i = 0; i < v.length; i++) {
			v[i] = recebeNumero();
			somaMedia = somaMedia + v[i];
		}
		media = somaMedia / v.length;
		System.out.println(Arrays.toString(v));
		System.out.println("A média é :" + media);
		
		if(v[i] > media) {
			
		}
	}
	public static int recebeNumero() {
		int n = (int) (1 + Math.random() * 100);
		return n ;
		
	}
}
	