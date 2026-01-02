package ifElse_Programs;

public class Practice_NestedIf {

	public static void main(String[] args) {
		
		int age =19;
		char gender ='f';
		
		if(age==18) {
			
			System.out.println("you can vote 1st time ");
			if (gender=='f') {
				
				System.out.println("you can vote girl");
				
			}
			else {
				System.out.println("please vote boy");
			}
			
		}
		
		else if (age>=18) {
			
			System.out.println("you are capable of vote");
		}
		
		 if (age <=17 ) {
			
			System.out.println("you can not vote");
		}
		else {
			
			System.out.println("dont have an idea");
		}
		
		

	}

}
