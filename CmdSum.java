import java.util.*;
class CmdSum
{
	public static void main(String[] args)
	{
		int sum=0;
		for(int i=0; i<args.length; i++)
		{
			int x= Integer.parseInt(args[i]);
			sum=sum+x;
		}
		System.out.println("Sum= "+sum);
	}
}