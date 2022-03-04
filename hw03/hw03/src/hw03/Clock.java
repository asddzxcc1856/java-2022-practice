package hw03;

public class Clock {
	private int hour,minute,second;
	
	public Clock(int hour,int minute,int second)
	{
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public void setHour(int hour)
	{
		if(hour <= 23)
			this.hour = hour;
		else
			this.hour = 0;
	}
	
	public void setMinute(int minute)
	{
		if(minute <= 59)
			this.minute = minute;
		else
			this.minute = 0;
	}
	
	public void setSecond(int second)
	{
		if(second <= 59)
			this.second = second; 
		else
			this.second = 0;
	}
	
	public int getHour()
	{
		return hour;
	}
	
	public int getMinute()
	{
		return minute;
	}
	
	public int getSecond()
	{
		return second;
	}
	
	public void displayTime()
	{
		System.out.printf("clock is : %2d:%2d:%2d%n",hour,minute,second);
	}
	
}
