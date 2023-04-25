import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner scannerName=new Scanner(System.in);
		System.out.println("Enter Your Name:");
	String	Name= scannerName.nextLine();
		Scanner scannerAge=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=scannerAge.nextInt();
		Scanner scannerSex=new Scanner(System.in);
		System.out.println("Define your sex:");
		String sex=scannerSex.nextLine();
	System.out.println(Name+" you are "+age+" years "+sex); 
		
		
		
	}

}
