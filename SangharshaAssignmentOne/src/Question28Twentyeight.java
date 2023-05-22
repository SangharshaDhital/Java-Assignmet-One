import java.util.ArrayList;
import java.util.Scanner;

/*28. Write a program in a single class having the following functions.
a. isPrimenumber(int)
b. firstNthPrime(int )
c. allPrimebetween(int start , int  end)
*/
public class Question28Twentyeight {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// a. isPrimenumber(int)
		System.out.println("Enter the no. you think I will tell it's Prime or not: ");
		int n = input.nextInt();
		boolean isPrime = isPrimeNumber(n);

		if (!isPrime) {
			System.out.println(n + " is not a prime number");
		} else {
			System.out.println(n + " is prime number");
		}
		// b. firstNthPrime(int )
		System.out.println("\nEnter the no. upto which you want to find prime no.: ");
		int n1 = input.nextInt();
		int[] primes = firstNthPrime(n1);
		System.out.print("The first " + n1 + " prime numbers are: ");
		for (int i = 0; i < primes.length; i++) {
			System.out.print(primes[i] + "  ");

		}

		// c. allPrimebetween(int start , int end)
		System.out.println("\n\nEnter the range you want to frind the prime no. inbetween\nStart: ");
		int start = input.nextInt();
		System.out.println("End: ");
		int end = input.nextInt();
		int[] primeRange = allPrimeBetween(start, end);
		System.out.println("Prime no. between " + start + " and " + end + " are : ");
		for (int i1 = 0; i1 < primeRange.length; i1++) {
			System.out.print(primeRange[i1] + "  ");
		}

	}

	public static boolean isPrimeNumber(int n) {
		if (n <= 1) {
			return false;

		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;

	}

	public static int[] firstNthPrime(int n) {
		int[] primes = new int[n];
		int count = 0;
		int i = 2;
		while (count < n) {
			if (isPrimeNumber(i)) {
				primes[count] = i;
				count++;

			}
			i++;
		}
		return primes;

	}

	public static int[] allPrimeBetween(int start, int end) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int i = start; i <= end; i++) {
			if (isPrimeNumber(i)) {
				primes.add(i);
			}
		}
		int[] primeArray = new int[primes.size()];
		for (int i = 0; i < primes.size(); i++) {
			primeArray[i] = primes.get(i);
		}
		return primeArray;

	}
}
