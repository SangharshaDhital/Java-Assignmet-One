import java.util.Scanner;

//40. Write a program to reverse the string.
public class Question40Forty {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = input.next();
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		System.out.println("Reverse of String \n" + str + " >---> " + rev);
	}

}
