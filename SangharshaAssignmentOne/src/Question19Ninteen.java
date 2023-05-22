import java.util.Scanner;

//19. Write a program to accept 3 sides of triangle and display it's kind
public class Question19Ninteen {

	public static void main(String[] args) {
		float[] side=new float[3];
		System.out.println("Enter the three sides of triangle :");
		Scanner input=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			side[i]=input.nextFloat();
		}
		if(side[0]+side[1]<=side[2]||
				side[1]+side[2]<=side[0]||
				side[0]+side[2]<=side[1]) {
			System.out.println("Input sides cannot form triangle");
		}
		else if(side[0]==side[1]&&side[1]==side[2]) {
			System.out.println("equatial triangle");
		}

		else if(side[0]==side[1]||side[0]==side[2]||side[1]==side[2]) {
			System.out.println("Isosceles triangle");
		}
		else {
			System.out.println("Scalene triangle");
		}
	}

}
