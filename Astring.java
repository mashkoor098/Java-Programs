import java.util.*;
class Astring
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String[] s = new String[5];
		System.out.println("Enter"+s.length+" Strings");
		int i;
		for(i=0;i<s.length;i++)
			s[i] = in.nextLine();
		for(i=0;i<s.length;i++)
			System.out.println("Length of \""+s[i]+"\" String is "+s[i].length());
	}
}