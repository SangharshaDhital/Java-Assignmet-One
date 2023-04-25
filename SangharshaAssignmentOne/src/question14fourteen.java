import java.util.Scanner;

//14. Write a program to relate two integers entered by the user using = =or > or < sign.
public class question14fourteen {

	public static void main(String[] args) {
		System.out.println("Enter two integer numbers:");
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	int b=input.nextInt();
	if(a==b) {
		System.out.println(a+" and "+b+" are equal");
	}
	else if(a<b){
		System.out.println(a+" is less than "+b);
	}
	else {
		System.out.println(a+" is greater than "+b);
	}
	}

}
