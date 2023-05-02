package logica.aulas.aula10;

public class MetodosComRet {
	public static void main(String[] args) {
		int resSoma = somar(2,123);
		System.out.println(resSoma);
	}
	static int somar(int a, int b) {
		int soma = a + b;
		return soma;
	}
}
