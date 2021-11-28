import java.util.Scanner;

public class Main_pattern{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i = 1;
		
		while (i <= n) {
			int col = 1;
			while (col <= i) {
				System.out.print(col);
				col++;
			}
			System.out.println("");
			i++;
		}
	}

}