import java.util.Scanner;

//27. Write a Program to sum each digit of given number as well as product. //456 =>4*5*6 and 4+5+6
public class question27Twentyseven {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the no. I will find it's product of each no.: ");
		int n=input.nextInt();
		int a=n,reminder;
		int product=1;
		while(n>0) {
			reminder=n%10;
			System.out.println(n);
			product=product*reminder;
			n=n/10;
		}
		System.out.println("the product of each no. of "+a+" is "+product);
	}

}
