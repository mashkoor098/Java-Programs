import java.util.*;
class Convert
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter length in meter");
		int m = in.nextInt();
		double km = (double)m/1000;
		System.out.println(m+" Meters = "+km+" KM");
	}
}