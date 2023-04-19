package logica.exercicios.aula05;

public class Exercicio02 {
	public static void main(String[] args) {
		int numi = 3;
		float numf = 3.36f;
		double numd = 3.35;

		System.out.printf("%s, %s, %s \n", numi, numf, numd);

		String numI = Integer.toString(numi);
		String numF = Float.toString(numf);
		String numD = Double.toString(numd);

		System.out.printf("%s, %s, %s \n", numI, numF, numD);
	}
}
