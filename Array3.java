import java.util.*;
class Array3
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
		int even=0, odd=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
				even++;
			else
				odd++;
		}
		System.out.println("Even numbers= "+even);
		System.out.println("Odd numbers= "+odd);
	}
}