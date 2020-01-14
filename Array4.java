import java.util.*;
class Array4
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
		System.out.println("Enter element to search");
		int item= in.nextInt();
		int i=0;
		while(a[i]!=item && a[i]<a.length)
		{
			i++;
		}
		if(i<a.length)
			System.out.println("Element is found");
		else
			System.out.println("Element is not found");
	}
}