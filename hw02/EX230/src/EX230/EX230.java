package EX230;

import java.util.Scanner;

public class EX230 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		System.out.printf("%d   %d   %d   %d   %d",num/10000,num/1000%10,num/100%10,num/10%10,num%10);
	}

}
