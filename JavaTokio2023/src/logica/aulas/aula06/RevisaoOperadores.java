package logica.aulas.aula06;

public class RevisaoOperadores {

	public static void main(String[] args) {
		int numero = 5;
		
		int valor = 5 + numero++;
		
		System.out.println(valor);
		// a diferença da localização do "++" é que se na frente, é realizado a atribuição após a aconta principal, e atrás é feito antes.
		System.out.println(numero);
	}

}
