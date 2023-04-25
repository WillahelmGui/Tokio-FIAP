package logica.exercicios.aula05.desafio;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

@SuppressWarnings("unused")
public class DesafioDatas {
	public static void criarDatas() {
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		Date dataAtual = new Date();
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe sua data de nascimento da seguinte forma: \"DD/MM/AA\"");
		String nascimento = sc.nextLine();
		sc.close();

		// Declaração do vetor da data de nascimento.
		String[] datas = nascimento.split("/", 3);
		String dias = datas[0];
		String meses = datas[1];
		String anos = datas[2];

		System.out.println("A data atual é:" + formatador.format(dataAtual));
		// Declaração do vetor da data atual.
		String[] dataAtualVetor = formatador.format(dataAtual).split("/", 3);
		String diaAtual = dataAtualVetor[0];
		String mesAtual = dataAtualVetor[1];
		String anoAtual = dataAtualVetor[2];

		// Conversão de String para Int.
		int d = Integer.parseInt(dias);
		int m = Integer.parseInt(meses);
		int a = Integer.parseInt(anos);
		int da = Integer.parseInt(diaAtual);
		int ma = Integer.parseInt(mesAtual);
		int aa = Integer.parseInt(anoAtual);

		int qtdDias = 0;
		int qtdMeses = 0;
		int qtdAnos = 0;
		
		do {
			d++;
			qtdDias++;
		if(d == 30) {
			d = 0;
			m++;
			qtdMeses++;
		}
		if(m == 12) {
			m = 0;
			a++;
			if(qtdMeses < 12) {
				continue;
			}
			++qtdAnos;
		}
		}while(a != aa || m != ma || d != da);
			
		System.out.printf("Você viveu \n Dias: %s  \n Meses: %s \n Anos: %s ", (qtdDias / qtdMeses),(qtdMeses / qtdAnos), qtdAnos);
	}

}
