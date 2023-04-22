/*11. Write a program to swap two numbers
a) using temp variable
b) without temp variable
*/
public class questionEleven {

	public static void main(String[] args) {
		Swap(10,7,0);
		Swap(9,100);
	}
	public static void Swap(int a, int b, int temp){
		System.out.println("USING temp VARIABLE");		
		//int a=10,b=7,temp=0;
		System.out.println("Before a="+a+" b= "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After  a="+a+" b= "+b);

		
	}
	public static void Swap(int a,int b){
		System.out.println("\nWITHOUT USING temp VARIABLE");	
		System.out.println("Before a=" +a+" b= "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After  a="+a+" b= "+b);
		
	}

}
