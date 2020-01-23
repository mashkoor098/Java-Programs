import java.util.*;
class CmdTest
{
	public static void main(String[] args)
	{
		System.out.println("Number of Command line arguments are "+args.length);
		System.out.println("Command line arguments values are as follow ");
		for(int i=0; i<args.length; i++)
		{
			System.out.println(args[i]);
		}
	}
}