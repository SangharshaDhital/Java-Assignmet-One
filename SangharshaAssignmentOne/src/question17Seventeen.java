import java.util.Scanner;

//17. Write a program to calculate leap year.
public class question17Seventeen {

	public static void main(String[] args) {
		System.out.println("This program only works according to western calender A.D. \n"
				+ "It is not applicable for B.S. and other calender");
		LeapYear();

	}
	public static void LeapYear() {
		System.out.println("Enter The Year in A.D.:");
		Scanner input=new Scanner(System.in);
		int year=input.nextInt();
		if ((year%100==0 && year%400==0)|| year%100!=0 && year%4==0) {
			System.out.println(year+" is a Leap Year");
		}
		else {
			System.out.println(year+" is not a Leap Year");
		}
	}

}
