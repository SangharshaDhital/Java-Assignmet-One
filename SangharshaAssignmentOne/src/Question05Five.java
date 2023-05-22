import java.util.Scanner;

//5.Write a program to find the area of a circle, rectangle, and triangle.
public class Question05Five {

	public static void main(String[] args) {
		System.out.println("Choose 1 or 2 or 3 To find the area? \n 1:Circle \n 2:Triangle \n 3:Rectangle");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		switch (n) {
		case 1:
			circle();
			break;

		case 2:
			triangle();
			break;
		case 3:
			rectangle();
			break;

		}
	}

	public static void circle() {
		System.out.println("Enter the radius of circle:");
		Scanner input = new Scanner(System.in);
		float r = input.nextFloat();
		double A = (Math.PI * r * r);
		System.out.println("The area of circle with " + r + " radius is :" + A + "square units");

	}

	public static void triangle() {
		System.out.println("Enter the base of triangle :");
		Scanner input = new Scanner(System.in);
		float b = input.nextFloat();
		System.out.println("Enter the Height of triangle :");
		float h = input.nextFloat();
		float A = 0.5f * b * h;
		System.out.println("The area of triangle with base " + b + " and Height " + h + " is " + A + " square units");

	}

	public static void rectangle() {
		System.out.println("Enter the length of rectangle:");
		Scanner input = new Scanner(System.in);
		float l = input.nextFloat();
		System.out.println("Enter the breadth of rectangle:");
		float b = input.nextFloat();
		float A = l * b;
		System.out.println("The area of rectangle with length " + l + "and breadth " + b + "is " + A + " square units");
	}
}
