import java.util.Scanner;

//8. Write a program that reads the radius and length of a cylinder and computes volume.?
public class Question08Eight {

	public static void main(String[] args) {
		VolumeOfCylinder();
	}

	static void VolumeOfCylinder() {
		System.out.println("Enter the length and radius of cylinder");
		Scanner input = new Scanner(System.in);
		float l = input.nextFloat();
		float r = input.nextFloat();
		System.out.println(
				"The Volume of Cylinder with radius " + r + " and length " + l + " is " + (Math.PI * r * r * l));
	}

}
