import java.util.Scanner;

//41. Write a program to find the duplicate letter in a word
public class Question41Fortyone {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any word:");
		String word=input.next();
		boolean[] visited=new boolean[word.length()];
		
		for(int i=0;i<word.length();i++) {
			if(!visited[i]) {
				int count =1;
			
			for(int j=i+1;j<word.length();j++) {
				if(word.charAt(i)==word.charAt(j)) {
					count++;
					visited[j]=true;
				}
			}
			if(count>1) {
				System.out.println("The letter '"+word.charAt(i)+"' is duplicated "+count+" times.");
			}
		}
	}

}
}