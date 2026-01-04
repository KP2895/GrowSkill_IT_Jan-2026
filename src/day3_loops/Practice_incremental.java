package day3_loops;

public class Practice_incremental {

	public static void main(String[] args) {

		// WAP to print from 1 to 10

		int a = 1;
		while (a <= 10) {

			System.out.print(a +" ");
			a++;
		}

		System.out.println("\n----------------------------");

		// WAP to reverse form 1 to 10

		int b = 10;
		while (b >= 1) {

			System.out.print(b +" ");
			b--;
		}

		System.out.println("\n--------------------------------");

		// Print incremental of 2 - 2,4,6 ..... 20.

		int c = 2;

		while (c <= 20) {
			System.out.println(c+ " ");
			c = c + 2;

		}

		System.out.println("\n--------------------------------");

		// Print reversal of incremental of 2 - 20,18,16.....2
		
		int d=20;
		
		while(d>=2) {
			
			System.out.println(d);
			d=d-2;
		}
		
		System.out.println("\n--------------------------------");

		
	}

}
