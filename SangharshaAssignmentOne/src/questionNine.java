import java.util.Scanner;

//9. Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit.
public class questionNine {

	public static void main(String[] args) {
		FahrenheitToCelsius();

	}

	public static void FahrenheitToCelsius() {
		System.out.println("What is the Temperature in Fahrenheit: ");
		Scanner input = new Scanner(System.in);
		float F = input.nextFloat();
		float C = (F - 32) / 1.8f;
		System.out.println(F + "degree Fahrenheit is " + C + " degree Celcius ");
	}
}
