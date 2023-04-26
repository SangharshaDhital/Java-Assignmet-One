import java.util.Scanner;

//21. Program to input the number of (1...7) and translate to its equivalent name of the day of the week.
public class question21TwentyOne {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 1 to 7  to find the equivalent day of the week: ");
		int n=input.nextInt();
		switch(n) {
		case 1:System.out.println(n+" = Sunday");
		break;
		case 2:System.out.println(n+" = Monday");
		break;
		case 3:
			
			System.out.println(n+" = Tuesday");
		break;
		case 4:
			System.out.println(n+" = Wednesday");
			break;
		case 5:
			System.out.println(n+" = Thrusday");
			break;
		case 6:
			System.out.println(n+" = Friday");
			break;
		case 7:
			System.out.println(n+" = Saturday");
			break;
			default:
				System.out.println("Invalid Input!!! Please enter 1 to 7 ");
				break;
		
		}

	}

}
