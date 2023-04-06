package studio8;


public class Time {
	
	private int hour;
	private int minute;
	private Boolean is12Hours;
	
	public Time(int hours, int minutes, Boolean is12Hour)
	{
		this.hour = hours;
		this.minute = minutes;
		this.is12Hours = is12Hour;
	}
	
	public String toString()
	{
		if (is12Hours = true)
		{
			if (hour > 12)
			{
				return (hour - 12) + ":" + minute + " PM";
			}
			else
			{
				return hour + ":" + minute + " AM";
			}
				
		}
		else
		{
			return hour + ":" + minute;
		}
			
	}
	
	public static void main(String[] args) {
 
    	
    }

}