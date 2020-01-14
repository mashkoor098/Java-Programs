	import java.util.*;
	class Average
	{
		public static void main(String [] args)
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Enter 3 numbers");
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			double avg = (a+b+c)/3.0;
			System.out.println("Average="+avg);
		}
	}