import java.util.*;
class Array1
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of array elements");
		int n = in.nextInt();
		int[] a = new int[n];
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