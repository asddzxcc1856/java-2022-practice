package hw04;

import java.util.Scanner;

public class EX4_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int binaryNumber = input.nextInt();
		
		int decimalNumber = 0;
		int weight = 1;
		while(binaryNumber != 0)
		{
			decimalNumber += binaryNumber % 10 * weight;
			binaryNumber /= 10;
			weight *= 2;
		}
		
		System.out.printf("Decimal Number is %d",decimalNumber);
	}

}
