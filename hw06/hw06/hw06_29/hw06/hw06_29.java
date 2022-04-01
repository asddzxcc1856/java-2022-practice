package hw06;

import java.security.SecureRandom;
import java.util.Scanner;

public class hw06_29 {

    private static final SecureRandom randomnumber = new SecureRandom();
    
    private enum Coin{HEADS,TAILS};
    
    private static final int HEAD = 0;
    private static final int TAIL = 1; 
    
    public static void main(String[] args) {
        int headtimes = 0;
        int tailtimes = 0;
        Scanner input = new Scanner(System.in);
        String option = input.nextLine();

        while(option.equals("Toss Coin"))
        {
            Coin getResult = flip();
            if(getResult == Coin.HEADS)
            {
                headtimes++;
            }
            else if (getResult == Coin.TAILS)
            {
                tailtimes++;
            }
            System.out.printf("headtimes : %d%ntailtimes : %d%n",headtimes,tailtimes);
            option = input.nextLine();
        }
        
    }
    public static Coin flip(){
        int number = randomnumber.nextInt(2);
        Coin getFlip = Coin.HEADS; 
        if(number == HEAD){
            getFlip = Coin.HEADS;
        }
        if(number == TAIL){
            getFlip = Coin.TAILS;
        }
        return getFlip;
    }
}
