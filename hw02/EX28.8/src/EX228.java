import java.util.Scanner;

public class EX228 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int r = input.nextInt();
		
		System.out.printf("diameter = %f%ncircumference = %f%narea = %f%n",2.0 * r,2 * r * Math.PI,r * r * Math.PI);
	}

}
