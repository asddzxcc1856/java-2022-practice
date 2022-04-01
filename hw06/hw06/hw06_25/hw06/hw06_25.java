package hw06;

public class hw06_25 {
	public static void main(String[] args) {
        System.out.print("all the prime number less than 10000 : \n");
        for(int i = 1 ; i < 10_000 ; i++)
        {
            if(isPrime(i))
            {
                System.out.printf("%d ",i);
            }
        }
    }
    public static boolean isPrime(int number){
        if(number <= 1)
            return false;
        if(number == 2)
            return true;
        for(int i = 2 ; i <= Math.sqrt(number) ; i++)
        {
            if(number % i == 0)
                return false;
        }
        return true;
    }
}
