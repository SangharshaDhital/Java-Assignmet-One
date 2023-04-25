import java.util.Scanner;

//15. Write a program that receives an ASCII code (between 0 – 128) and display its character [example: 97 (input) ->a(output)].
public class question15fifteen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an ASCII code between 0 - 128 : ");
        int asciiCode = scanner.nextInt();

        if (asciiCode <0 || asciiCode > 128) {
            System.out.println("Invalid ASCII code entered.");
        } else {
            char character = (char)asciiCode;
            System.out.println("The corresponding character is: " + character);
        }	

	}

}
