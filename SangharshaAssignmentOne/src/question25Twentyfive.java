import java.util.Scanner;

//25.Write a program that prompts the user to enter the no. of students and each student's name and score. Finally display the student with the highest sccore.
public class question25Twentyfive {

	public static void main(String[] args) {
		float highScore = 0;
		String highName = "";

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no. of Students: ");
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter the name of Student : ");
			String name = input.next();
			System.out.println("Enter the Score of Student: ");
			float Score = input.nextFloat();

			if (Score > highScore) {
				highScore = Score;
				highName = name;
			}

		}
		System.out.println(highName + " got highest Score " + highScore);

	}

}
