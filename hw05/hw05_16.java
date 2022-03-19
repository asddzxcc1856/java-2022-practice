package hw05_16;

import java.util.Scanner;

public class hw05_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int fivenumber = 0;
		for(int i = 0 ; i < 5 ; i++) {
			int number = input.nextInt();
			fivenumber += number * (int) Math.pow(10, i);
		}
		for(int i = 0 ; i < 5 ; i++) {
			int number =  fivenumber % 10;
			fivenumber /= 10;
			for(int j = 0 ; j < number ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
