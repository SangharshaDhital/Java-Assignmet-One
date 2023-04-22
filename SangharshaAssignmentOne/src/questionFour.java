import java.util.Scanner;

//4.Write a program to calculate Simple Interest input by the user. Simple Interest = P*T*R/100
public class questionFour {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the principal amount:$");
		float P= input.nextFloat();
		System.out.print("Enter the time in years upto which you want to keep Principal for:");
		float T=input.nextFloat();
		System.out.print("Enter the amount of rate you are charged for:");
		float R=input.nextFloat();
		float I=(P*T*R)/100;
		System.out.print("You will be paying $"+I+" interest in the span of "+T+" years with "+R+"% interest rate.");
	}

}
