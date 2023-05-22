import java.util.Scanner;

//38. Write a program to check whether a given string is palindrome or not.
public class Question38Thirtyeight {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string:  ");
		String str=input.next().toLowerCase();
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse+=str.charAt(i);
		}
	
		if(str.equals(reverse)) {
			System.out.println(str+" is palindrome");
		}
		else
		{
			System.out.println(str+" is not palindrome");
	}

}
}