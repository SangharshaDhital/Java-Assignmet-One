import java.util.Scanner;

//Write a program to find sum and average of two numbers input by User (using Scanner class).
public class Question03Three {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first integer no. : ");
		int i = input.nextInt();
		System.out.println("Enter the Second integer no. :");
		int j = input.nextInt();
		int sum = i + j;
		System.out.println("The Sum of " + i + " and " + j + " is :" + sum);

	}

}
