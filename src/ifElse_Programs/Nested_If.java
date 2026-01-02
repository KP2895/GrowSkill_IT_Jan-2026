package ifElse_Programs;

public class Nested_If {

	public static void main(String[] args) {

		int age = 18;
		char gender = 'f';

		if (age == 18) {

			System.out.println("congrats on your first vote");

			if (gender == 'f') {

				System.out.println("please vote girl");

			} else {

				System.out.println("please vote boy");
			}

		}

		if (age > 18) {

			System.out.println("age is greater than 18");
		} else {

			System.out.println("you can not vote");
		}

	}

}
