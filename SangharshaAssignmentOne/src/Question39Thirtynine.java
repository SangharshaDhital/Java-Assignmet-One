import java.util.Scanner;

//39. Write a Program to display names in short form. E.g. Ram Kishore Singh  -> R. k. Singh
public class Question39Thirtynine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First name:");
		String fName = input.next();
		char f = fName.charAt(0);
		System.out.println("Enter Middle name:");
		String mName = input.next();
		char m = mName.charAt(0);
		System.out.println("Enter Last name:");
		String lName = input.next();
		System.out.println("The Short Verson of name: \n" + fName + " " + mName + " " + lName + " \nis :\n" + f + ". "
				+ m + ". " + lName);

	}

}
