import java.util.*;
class tarea
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter length and breadth of trianglr");
		int l= in.nextInt();
		int b= in.nextInt();
		double area = (double)(0.5)*l*b;
		System.out.println("Area of triangle = "+area);
	}
}