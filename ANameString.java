import java.util.*;
class ANameString
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String[] s = new String[5];
		System.out.println("Enter "+s.length+" Strings");
		int i;
		for(i=0;i<s.length;i++)
			s[i] = in.nextLine();
		System.out.println("Names starting with 'A' are: ");
		for(i=0;i<s.length;i++)
		{
			if(s[i].charAt(0)=='A' || s[i].charAt(0)=='a')
				System.out.println(s[i]);
		}
	}
}