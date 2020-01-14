import java.util.*;
class Array2
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
		int sum=0;
		for(int i=0; i<a.length; i++)
			sum=sum+a[i];
		double avg = (double)sum/a.length;
		System.out.println("Sum= "+sum);
		System.out.println("Average= "+avg);

	}
}
