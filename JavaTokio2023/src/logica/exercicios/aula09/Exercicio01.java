package logica.exercicios.aula09;

public class Exercicio01 {
	public static void main(String[] args) {
//▪ Considerando o trecho de código Java representado a seguir:
		int[] v = {2, 0, 3, 9};
		v[v[2]] = v[v[1]];
		for (int i: v){
		System.out.print(i);
		}
//▪ O que será impresso na tela?
//a) 2 0 3 2 --> Esse é o correto
//b) 2 0 3 9
//c) 2 0 0 9 
//d) 2 3 3 2
	}
}
//A) é a resposta correta pois os valores são substituidos duas vezes na linha 7.
//Por exemplo: v[v[1]] v[1] = 0, logo v[v[1]] é igual a v[0], e v[0] = 2.
// então seguindo a mesma lógica v[v[2]]. v[2] = 3, logo v[3] = 9.