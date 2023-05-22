import java.util.Scanner;

//18. Write a program to display the largest number from given three values.
public class Question18Eighteen {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
float[] num=new float[3];
System.out.println("Enter three numbers:");
for(int i=0;i<3;i++) {
	num[i]=input.nextFloat();
	}
System.out.print("The lagest no. among ");
for(int i=0;i<3;i++) {
	System.out.print(num[i]+" , ");
}

float largest=num[0];
for(int i=1;i<3;i++) {
	if(num[i]>largest) {
		largest=num[i];
	}
	
}
System.out.println(" is "+largest);
	}

}
