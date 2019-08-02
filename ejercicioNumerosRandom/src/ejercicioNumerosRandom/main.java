package ejercicioNumerosRandom;

import java.util.Random;

public class main {

	public static void main(String[] args) {

		int numram1 = 0;
		int numram2 = 0;
		int num1 = 0;
		int num2 = 0;

		for (int i = 1; i <= 10; i++) {

			/*
			 * Random r1 = new Random(999); Random r2 = new Random(999);
			 */

			
			numram1 = (int) (Math.random() * i) + 1; 
			numram2 = (int) (Math.random() * i) + 1;
			 

			num1 = numram1 - numram2;
			num2 = numram1 + numram2;

			System.out.println(numram1 + "+" + numram2 + "=" + num1 + " " + num2);

		}

	}

}
