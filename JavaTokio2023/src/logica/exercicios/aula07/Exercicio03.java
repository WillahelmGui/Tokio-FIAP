package logica.exercicios.aula07;

public class Exercicio03 {
public static void main(String[] args) {
	int num = (int) (Math.random() * 10);
	for(int i = 0;  i < 26; i++) {
		System.out.println(num + " * " + i + " = " + (num * i) );
	}
}
}
