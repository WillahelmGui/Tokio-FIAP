package logica.aulas.aula08;

import java.util.Calendar;
import java.util.Date;

public class MathOperadores {
	public static void main(String[] args) {
	Datas();

	}

	public static void Datas() {
		Date data = new Date();
		System.out.println(data);
		
		Calendar c = Calendar.getInstance();
		c.getTime();
		System.out.println("A hora atual é : " + c.getTime());
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	}

	public static void vetor() {
		int[] verInt = new int[10];
		verInt[0] = 10;
	}
}