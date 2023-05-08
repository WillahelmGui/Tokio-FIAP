package logica.aulas.aula09;

public class Atividade02 {
	public static void main(String[] args) {
		int[][] matriz = new int[4][5];

		// num de linhas da matriz
		int lin = matriz.length;
		System.out.println(lin);
		// num de colunas da matriz
		int col = matriz[0].length;
		System.out.println(col);

		int num = 1;
		for (int j = 0; j < col; j++) {
			matriz[0][j] = num;
			num++;
		}

		
		for (int i = 0; i < lin; i++) {
			for (int j = 0; j < col; j++) {
				matriz[i][j] = num;
				num++;
			}
		}
		for (int i = 0; i < lin; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println(""); // pular linha
		}
	}
}
