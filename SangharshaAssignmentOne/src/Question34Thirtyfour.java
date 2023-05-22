import java.util.Scanner;

//34. Write a program to reverse the element of an array.
public class Question34Thirtyfour {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the intergers of an array you want to enter: ");
		int n = input.nextInt();
		int[] a = new int[n];
		System.out.println("please enter " + n + " elements: ");
		for (int i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}
		System.out.println("The elements of the Array are:");
		{
			for (int i = 0; i < n; i++) {
				System.out.println(a[i]);
			}
		}
		System.out.println("Reverse Elements of above are are: ");
		for (int j = n - 1; j >= 0; j--) {
			System.out.println(a[j]);
		}
	}

}
