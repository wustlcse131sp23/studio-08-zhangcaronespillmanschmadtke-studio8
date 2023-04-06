package studio8;

import java.util.LinkedList;
import java.util.List;

public class Date {
	
	private int month;
	private int date;
	private int year;
	private Boolean isHoliday;
	private List<Date> dates = new LinkedList<Date>();
	
	public Date(int newMonth, int newDate, int newYear, Boolean holidayStatus)
	{
		this.month = newMonth;
		this.date = newDate;
		this.year = newYear;
		this.isHoliday = holidayStatus;
		
	}
	
	public int hashCode()
	{
		return 0;
	}
	
	public String toString()
	{
		return month + "." + date + "." + year + " Holiday: " + isHoliday + ".";
	}

    public static void main(String[] args) {

    }

}
