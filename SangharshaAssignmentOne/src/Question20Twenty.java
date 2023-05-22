import java.util.Scanner;

/*20. Write a program to create the equivalent of a four-function calculator. 
The program to enter two integer’s numbers and an operator. It then carries
out the specified arithmetic operator operation: addition, subtraction, multiplication 
or division of the two numbers. Finally, it displays the result.
*/
public class Question20Twenty {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first no.");
		int a=input.nextInt();
		System.out.print("Enter the Operato (+,-,*,/):");
		char ch=input.next().charAt(0);
		System.out.println("Enter the second no.");
		int b=input.nextInt();
switch(ch) {
case '+':
	System.out.println(a+" + "+b+" is "+(a+b));
	break;
case '-':
	System.out.println(a+" - "+b+" is "+(a-b));

case '*':
	System.out.println(a+" * "+b+" is "+(a*b));
	break;
case '/':
	if(b==0) {
		System.out.println("Number cannot be divided by zero!!!");
	}
	else
	System.out.println(a+" / "+b+" is "+(a/b)+" with remainder "+(a%b));
	break;
default:
	System.out.println("Please select the above operation as displayed:!!!");
	}
	}
}
