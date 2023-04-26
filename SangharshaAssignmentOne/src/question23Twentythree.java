import java.util.Scanner;

//23.Write a program to find the sum of 1 to nth natural no.
public class question23Twentythree {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the no. upto which you want to find it's sum.:");
		int n=input.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("The sum from 1 to "+n+" is : "+sum);
				}

}
