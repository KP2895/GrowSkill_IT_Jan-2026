package day3_loops;

public class Practice_multipleofnmbers {

	public static void main(String[] args) {
		// if multiple of 15 print hello
		//multiple of 20 print bye
		//all are multiple of 5 -- upto 60
		
		int a=5;
		
		while(a<=60) {
			
			if(a%15==0) {
				
				System.out.println("Hello");
			}
			else if (a%20==0) {
				
				System.out.println("Bye");
			}
			else {
				System.out.println(a);
			}
			
			a=a+5;
			
			
		}
		
		
		
		
	}

}
