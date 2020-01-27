import java.util.*;
class InfoEqual
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String[] s = new String[3];
		System.out.println("Enter "+s.length+" Strings");
		for(int i=0; i<s.length; i++)
			s[i] = in.nextLine();
		for(int i=0; i<s.length; i++)
		{
			if(s[i].equals("Info"))
			{
				System.out.println("String is provided");
				break;
			}
		}
	}
}