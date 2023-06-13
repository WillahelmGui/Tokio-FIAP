package primeiraAula;

public class Fibonacci {
	public static void main(String[] args) {
		int resultado = 0, numAtual = 1, numAnterior = 0;

		do {
			resultado = numAtual + numAnterior;
			numAnterior = numAtual;
			numAtual = resultado;
			System.out.println(resultado);
		} while (resultado < 1000);

	}
}
