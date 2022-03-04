package hw03;

import java.util.Scanner;

public class ClockTest {

	public static void main(String[] args) {
		Clock clock = new Clock(9,20,50);
		//get hour minute second
		System.out.printf("clock is : %2d:%2d:%2d%n",clock.getHour(),clock.getMinute(),clock.getSecond());
		
		Scanner input = new Scanner(System.in);
		//set hour
		int hour = input.nextInt();
		clock.setHour(hour);
		System.out.printf("clock is : %2d:%2d:%2d%n",clock.getHour(),clock.getMinute(),clock.getSecond());
		//set minute
		int minute = input.nextInt();
		clock.setMinute(minute);
		System.out.printf("clock is : %2d:%2d:%2d%n",clock.getHour(),clock.getMinute(),clock.getSecond());
		//set second
		int second = input.nextInt();
		clock.setSecond(second);
		System.out.printf("clock is : %2d:%2d:%2d%n",clock.getHour(),clock.getMinute(),clock.getSecond());
		
		//displayTime
		clock.displayTime();
		
	}

}
