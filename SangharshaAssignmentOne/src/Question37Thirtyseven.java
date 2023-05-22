/*37. Write a Program to perform for the following task.
1 2 3		4 5 6		5 7 9
4 5 6  +	2 7 8	=	6 12 14
7 8 9		3 1 9		10 9 18
*/
public class Question37Thirtyseven {

	public static void main(String[] args) {
		System.out.println("A = ");
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		printMatrix(a);
		System.out.println();
		System.out.println("B= ");
		System.out.println();
		int[][] b = { { 4, 5, 6 }, { 2, 7, 8 }, { 3, 1, 9 } };
		printMatrix(b);
		System.out.println("Sum of two matrix A + B= ");
		int[][] sum = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum[i][j] = a[i][j] + b[i][j];

			}

		}
		printMatrix(sum);
	}

	private static void printMatrix(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println("\n");
		}

	}
}
