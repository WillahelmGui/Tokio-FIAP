package logica.exercicios.aula06;

public class Exercicio08 {
	public static void main(String[] args) {
		float distanciaPercorrida = 0, consumoDeGasolina = 0, kmPorLitro;
		
		//Logica de cálculo
		distanciaPercorrida = (float) (Math.random() * 50);
		System.out.println("A distância percorrida é: " + distanciaPercorrida);
		consumoDeGasolina = (float) (Math.random() * 10);
		System.out.println("O consumo de gasolina em litros é : " + consumoDeGasolina);
		kmPorLitro = distanciaPercorrida / consumoDeGasolina;
		System.out.println("Você percorre essa ditância por litro de gasolina : " + kmPorLitro);
		
		if(kmPorLitro < 8) {
			System.out.println("Esse carro bebe hein!");
		} else {
			System.out.println("Autonomia legal!");
		}
	}
}
