package logica.exercicios.aula05;
import java.util.Scanner;
public class Exercicio07 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Valor do produto:");
	float valorDoProduto = sc.nextFloat();
	System.out.println("Valor do pagamento:");
	float valorPago = sc.nextFloat();
	if(valorPago > valorDoProduto || valorPago == valorDoProduto) {
	System.out.println("O troco é:" + (valorPago - valorDoProduto));
	} else {
		System.out.println("Caloteiro!");
	}
	sc.close();
}
}
