package primeiraAula;

public class Fatorial {
	public static void main(String[] args) {
		int  n= 4, numInicial = n,resultado = 0; //5 é o exemplo apenas, poderia ser qualquer número.
		
		
		for(int i = (n - 1); i >= 1; i--) {
			resultado = n * i;
			n = resultado;
		}
		System.out.printf("%s! = %s", numInicial, resultado);
	}
}
