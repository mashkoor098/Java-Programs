import java.util.*;

class CurrentDate
{
	public static void main(String[] args)
	{
		Date obj = new Date();

		System.out.println("Date: "+obj.getDate());
		System.out.println("Month: "+obj.getMonth());
		System.out.println("Year: "+obj.getYear());

		System.out.println("Hours: "+obj.getHours());
		System.out.println("Minutes: "+obj.getMinutes());
		System.out.println("Seconds: "+obj.getSeconds());
	}
}