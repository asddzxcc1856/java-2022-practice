package hw05_20;

public class hw05_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sigma n = 0 200000 (-1)^n * (4) /(2n + 1)
		double pi = 0,ans = 0;
		int getTerm = -1;
		for(int i = 0 ; i < 200000; i++) {
			
			pi += (Math.pow(-1,i) * 4 / (2*i + 1));
			System.out.printf("At %d terms, pi = %.15f %n",(i + 1), pi);
			if(getTerm == -1 && (int)(pi * Math.pow(10, 5)) == 314159)
			{
				getTerm = (i + 1);
			}
		}
		System.out.printf("First get a value that begins with 3.14159 at %d terms%n",getTerm);
	}

}
