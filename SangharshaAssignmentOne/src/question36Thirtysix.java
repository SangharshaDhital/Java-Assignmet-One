import java.util.Scanner;

//36. Write a function to find duplicate elements in an array.
public class question36Thirtysix {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the no. of elements you want to put in the Array:");
		int n=input.nextInt();
		int[] arr=new int[n];
		int k=0;
		System.out.println("Enter "+n+" integers of an array: ");
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		System.out.println("The elements of given array are:");
		for(int i=0;i<n;i++) {
	System.out.println(arr[i]);
		}
		duplicatElements(arr);
	}

	public static void duplicatElements(int[] arr) {
	int n=arr.length;
	boolean[] visited=new boolean[n];
	
	boolean foundDuplicates=false;
	for(int i=0;i<n;i++) {
		if(!visited[i]) {
			int count=1;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
				count++;
				visited[j]=true;
				}
			}
			if(count>1) {
				System.out.println("Duplicate Elements and their repitation counts are:");
				System.out.println("\nElement: "+arr[i]+", Count:"+count);
				
				foundDuplicates=true;
			}
			
		}
		
	}
	if(!foundDuplicates) {
		System.out.println("\nThere are no duplicates elements in the given array:");
	}
	}
}