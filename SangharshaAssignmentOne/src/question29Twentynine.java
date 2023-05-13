import java.util.Scanner;

/*29. Write a Program for the following Mathematical function
a=1+(2/2!)+(3/3!)+4/4!)+...+(n/n!)
*/
public class question29Twentynine {

	public static void main(String[] args) {
		
Scanner input=new Scanner(System.in);
System.out.println("Entet the nth no to find the sum of the series a=1+(2/2!)+(3/3!)+4/4!)+...+(n/n!) ");
int n=input.nextInt();
double sum=0;
int fact=1;
for(int i=1;i<=n;i++) {
	fact*=i;
	//System.out.println(fact);
	sum+=(i/(double)fact);
	//System.out.println(sum);
}
System.out.println("The sum of function a=1+(2/2!)+(3/3!)+4/4!)+...+(n/n!) upto "+n+"th value is: "+sum);
System.out.println("it will find the persise value upto 33rd term \nafter that it can't hold it's value\n"
		+ " and shows infinity which is not correct take it's value as 2.718281885744502 if showing infinity");
	}

}
