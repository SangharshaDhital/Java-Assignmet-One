import java.util.Scanner;

//30. Write a program to print the Fibonacci series. 1 1 2 3 5 8 ...
public class Question30Thirty {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no. of terms you want to find the fibonacci series: ");
		int n = input.nextInt();
		int a = 1;
		int b = 1;
		int sum = 0;
		System.out.print("the required fibonacci series is : " + a + " " + b);
		for (int i = 3; i <= n; i++) {
			// System.out.println(a);
			// System.out.println(b);
			sum = a + b;
			a = b;
			b = sum;
			System.out.print(" " + sum);
		}

	}

}
