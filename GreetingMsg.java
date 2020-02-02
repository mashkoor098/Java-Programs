import java.util.*;

class GreetingMsg
{
	public static void main(String[] args)
	{
		Date obj = new Date();

		if(obj.getHours()>=0 && obj.getHours()<=5)
			System.out.println("Good Night");
		else if(obj.getHours()>5 && obj.getHours()<=12)
			System.out.println("Good Morning");
		else if(obj.getHours()>12 && obj.getHours()<=17)
			System.out.println("Good Afternoon");
		else if(obj.getHours()>17 && obj.getHours()<=21)
			System.out.println("Good Evening");
		else if(obj.getHours()>21 && obj.getHours()<=24)
			System.out.println("Good Night");

	}
}