import java.util.Scanner;

//26. Write a Program to reverse the given number. //123 => 321
public class question26Twentysix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int reverse = 0;
		int reminder = 0;
		System.out.println("Enter the integer I will find it's reverse: ");
		int n = input.nextInt();
		int a = n;
		while (n > 0) {
			reminder = n % 10;
			reverse = reverse * 10 + reminder;
			n = n / 10;		
		}
		System.out.println("reverse of " + a + " is " + reverse);
	}

}
