import java.util.*;
class VowelString
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String[] s = new String[5];
		System.out.println("Enter "+s.length+" Strings");
		int j,i;

		for(i=0; i<s.length; i++)
			s[i]= in.nextLine();
		int c=0,total=0;
		for(i=0; i<s.length; i++)
		{
			c=0;
			for(j=0; j<s[i].length(); j++)
			{
				if(s[i].charAt(j) == 'A' || s[i].charAt(j) == 'a' || s[i].charAt(j) == 'E' || s[i].charAt(j) == 'e' || s[i].charAt(j) == 'I' || s[i].charAt(j) == 'i' || s[i].charAt(j) == 'O' || s[i].charAt(j) == 'o' || s[i].charAt(j) == 'U' || s[i].charAt(j) == 'u')
					c=c+1;
			}
			total=total+c;
			System.out.println("There are "+c+" Vowels in "+s[i]);
		}
		System.out.println("Total vowels= "+total);
	}
}