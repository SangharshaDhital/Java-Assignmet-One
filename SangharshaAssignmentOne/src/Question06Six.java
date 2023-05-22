import java.util.Scanner;

/*6.program that converts pounds into kg. 
The program prompts the user to enter a number of pounds,
 converts it to kg and displays the result [1 pound is 0.454 kg].
 */
public class Question06Six {

	public static void main(String[] args) {
		System.out.println("Enter the no. of pounds you want to change to kg:");
		Scanner input=new Scanner(System.in);
		float pound=input.nextFloat();
		System.out.println(pound+"Pound = "+0.454f*pound+"kg");
	}

}
