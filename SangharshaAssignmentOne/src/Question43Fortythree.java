import java.util.Scanner;

//43. Write a program to trap the exception handling to trap the divided by zero 
//and out of index value in array.
public class Question43Fortythree {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
//Arthematic Exception
		try {
			System.out.println("Numerator : ");
			int nr = input.nextInt();
			System.out.println("Enter Dinominator: ");
			int dnr = input.nextInt();
			float result = nr / dnr;
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Error!!! 'Infinity' number cannot be divided by zero ");

		}
//Out of index value in array
		try {
			int[] numbers = { 1, 2, 3, 4, 100, 99 };
			System.out.println(numbers);
			System.out.println("Enter an array index: ");
			int index = input.nextInt();
			int value = numbers[index];
			System.out.println("The index of Array at no. " + index + " contains " + value);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error!!!!: Index out of bound.");
		}
	}

}
