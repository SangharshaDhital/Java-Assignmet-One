import java.util.Scanner;

//7.Write a program to find the perimeter of a circle, triangle, and rectangle.
public class Question07Seven {

	public static void main(String[] args) {
		System.out.println(
				"Choose 1 or 2 or 3 to find the perimeter \n " + "1: Circle \n " + "2: Triangle \n " + "3: Rectangle");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		switch (n) {
		case 1:
			Pcircle();
			break;
		case 2:
			Ptriangle();
			break;
		case 3:
			Prectangle();
			break;
		}

	}

	public static void Pcircle() {
		System.out.println("Enter the radius of circle:");
		Scanner input = new Scanner(System.in);
		float r = input.nextFloat();
		double P = 2 * Math.PI * r;
		System.out.println("the prerimeter of given circle is: " + P + " units");
	}

	public static void Ptriangle() {
		System.out.println("enter three sides of triangel:");
		Scanner input = new Scanner(System.in);
		float a = input.nextFloat();
		float b = input.nextFloat();
		float c = input.nextFloat();
		System.out.println("the perimeter of triangle with sides " + a + " " + b + "and " + c + "is: " + a + b + c);

	}

	public static void Prectangle() {
		System.out.println("Enter the length and breadth of rectangle:");
		Scanner input = new Scanner(System.in);
		float l = input.nextFloat();
		float b = input.nextFloat();
		System.out.println("The perimeter of rectangle with length " + l + " and breadth " + b + " is " + (2 * (l + b))
				+ " units");
	}

}
