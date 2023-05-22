import java.util.Scanner;

//32. Write a Program to accept 5 values in an array and display their sum.
public class Question32Thirtytwo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the five integer in an array:");
		int[] a = new int[5];
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			a[i] = input.nextInt();
			sum += a[i];
		}
		System.out.print("The entered Array is: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println("\nThe required sum of above entered no. in an Array is: " + sum);
	}

}
