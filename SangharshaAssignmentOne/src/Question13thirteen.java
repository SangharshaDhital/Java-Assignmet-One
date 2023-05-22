import java.util.Scanner;

//13. Write a program to print the number entered by the user only if the number entered is negative.
public class Question13thirteen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any Real no. ");
		float n = input.nextFloat();

		if (n < 0)
			System.out.println(n + " is negative");
		else {
			System.out.println("Enter Negative no.");
		}

	}

}
