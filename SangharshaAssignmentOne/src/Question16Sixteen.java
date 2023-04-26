import java.util.Scanner;

//16. Write a program to find the given number is even or odd.
public class Question16Sixteen {

	public static void main(String[] args) {
		System.out.println("Enter the no.: ");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		if (n%2==0) {
			System.out.println(n+" is Even");
		}
		else {
			System.out.println(n+" is Odd");
		}
	}

}
