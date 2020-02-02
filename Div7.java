import java.util.*;

class Div7
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number");
		int no = in.nextInt();
		if(no%7==0)
			System.out.println(no+" is divisible by 7");
		else
			System.out.println(no+" is not divisible by 7");
	}
}