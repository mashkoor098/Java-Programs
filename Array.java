import java.util.*;
class Array
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int[] a = new int[10];
		System.out.println("Enter "+a.length+" Numbers");
		for(int i=0;i<a.length;i++)
			a[i]= in.nextInt();
		int max= a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("Maximum= "+max);
	}
}