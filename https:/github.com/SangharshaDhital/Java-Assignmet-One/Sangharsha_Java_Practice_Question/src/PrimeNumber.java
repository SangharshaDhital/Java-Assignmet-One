
//Write a program that accepts a number as input and checks whether it is a prime number or not.

//import java.util.Scanner;
//
//public class PrimeNumber {
//
//	public static void main(String[] args) {
//
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter the number:");
//		int num = input.nextInt();
//		boolean isPrime = true;
//		
//		
//
//			for (int i = 2; i <= num / 2; i++) {
//				if (num % i == 0)
//					;
//				isPrime = false;
//				break;
//			}
//			if (isPrime) {
//				System.out.println(num + " is prime");
//			} else
//				System.out.println(num + " is not prime");
//
//		}
//	}
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        boolean isPrime = true;
        if (number == 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < number/2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
