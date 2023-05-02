package logica.aulas.aula10;

public class MetodosComArg {
	// Metodos sem retorno com parametros/argumentos.
	public static void main(String[] args) {
		saudacaoComArgs("Guilherme", 18);

	}

	static void saudacaoComArgs(String nome, int idade) {
		if (idade >= 18) {
			System.out.printf("Ola, %s! Voce tem %d anos e eh maior de idade", nome, idade);
		} else {
			System.out.printf("Ola, %s! Voce tem %d anos e eh menor de idade", nome, idade);
		}
	}
}
