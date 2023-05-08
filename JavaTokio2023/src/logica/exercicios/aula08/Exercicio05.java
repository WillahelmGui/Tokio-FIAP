package logica.exercicios.aula08;

//Exercício 5
//
//▪ Faça um programa que sorteie 10 números aleatórios entre 5 e 50.
//▪ Some todos esses números e exiba o resultado final.
public class Exercicio05 {
	public static void main(String[] args) {
	 //Sorteador de números
		double numMinimo = 5;
		double numMax = 50;
		double somaNum = 0;
		for(int i = 0; i < 10; i++) {
		double numSorteado = numMinimo + Math.random() * (numMax - numMinimo);
		
		System.out.println("Numero" + i +": " +  numSorteado);
		somaNum = somaNum + numSorteado;
		}
		System.out.println("A soma de todos os números é: " + somaNum);
	}
}
