package logica.exercicios.aula09;

public class Exercicio02 {
	public static void main(String[] args) {
//▪ Execute o trecho Java a seguir e marque a opção que contém o valor que será exibido na
//tela:
		String s = "FIAPTOKIO";
		char[] r = new char[9];
		for (int i = s.length() - 1; i >= 0; i--) {
		r[i] = s.charAt(i);
		}
		for (char letra: r) {
		System.out.print(letra);
		}
	}
}
//
//a) OIKOTPAIF
//b) FIAPTOKIO --> Correto.
//c) 1110162068068
//d) 150,251,02