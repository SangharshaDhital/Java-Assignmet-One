import java.util.Scanner;

//33. Write a Program to display numbers in ascending order in array
public class questin33Thirtythree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no. of integer you want to put in an Array: ");
		int n = input.nextInt();
		System.out.println("Ok! Enter " + n + " numbers:");
		int[] a = new int[n];
		int temp = 0;
		for (int i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}
		System.out.println("The ascending order of the above arry entered is: ");
		for (int each : a) {
			System.out.println(each);
		}
	}

}
