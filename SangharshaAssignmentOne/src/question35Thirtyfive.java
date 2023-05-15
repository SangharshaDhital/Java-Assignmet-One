import java.util.Arrays;
import java.util.Scanner;

//35. Write a function to find the second largest number in a given array.
public class question35Thirtyfive {
//This logic is not valid if the repeated largest no. is in second palace
	/*
	 * public static void main(String[] args) { Scanner input=new
	 * Scanner(System.in); System.out.
	 * println("Enter the no. of elements you want to put in an Array it should be greater than 1 :"
	 * ); int n=input.nextInt(); System.out.println("enter "+n+" elements"); int[]
	 * a=new int[n]; for(int i=0;i<n;i++) { a[i]=input.nextInt(); }
	 * 
	 * Arrays.sort(a); for(int i=n-2;i>+0;i--) { if(a[i]!=a[n-1]) {
	 * 
	 * } System.out.println("the second lagrgest element is: "+a[i]); }
	 * 
	 * }
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no. of elements you want to put in an Array: ");
		int n = input.nextInt();
		System.out.println("Enter  " + n + " integers of an array:");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}
		System.out.println("The Second Largest elements among:");
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		int secondLargest = findSecondLargest(a);
		System.out.print("is: " + secondLargest);
	}

	public static int findSecondLargest(int[] arr) {
		if (arr.length < 2) {
			throw new IllegalArgumentException("Array must have at least two elements");
		}

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}

		if (secondLargest == Integer.MIN_VALUE) {
			throw new IllegalArgumentException("Second largest element does not exist");
		}

		return secondLargest;
	}

}
