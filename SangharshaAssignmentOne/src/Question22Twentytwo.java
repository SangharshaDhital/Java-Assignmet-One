import java.util.Scanner;

//22. Write the program to print the table of given no.
public class Question22Twentytwo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the no. which you want to print the table: ");
		int n=input.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n+" * "+i+" = "+(n*i));
		}
	}

}
