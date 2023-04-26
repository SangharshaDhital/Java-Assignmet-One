import java.util.Scanner;

//24.Write a program to find the factorial of given no.
public class question24Twentyfour {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the no. you want to find factorial of: ");
		int n=input.nextInt();
	int a=n;
		int fact=1;
		while(n>0) {
			fact*=n;
			n--;
		}
		System.out.println("the factorial of "+a+" is: "+fact);
	}

}
