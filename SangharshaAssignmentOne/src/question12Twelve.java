import java.util.Scanner;

/*12. Write a program to accept the roll, name, and nationality of 
 * the person and display those values in good format.
 */
public class question12Twelve {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name = input.next();
		System.out.println("Enter Your Nationality:");
		String country = input.next();
		System.out.println("Enter Your Roll No.:");
		int roll = input.nextInt();
		System.out.println(" Name: " + name + "\n Nationality: " + country + "\n Roll No.: " + roll);

	}

}
