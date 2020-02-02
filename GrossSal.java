import java.util.*;

class GrossSal
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Basic Salary");
		int bsal = in.nextInt();

		double hra, da;

		if(bsal<5000)
		{
			hra = (0.10)*bsal;
			da = (0.25)*bsal;
		}
		else
		{
			hra = (0.20)*bsal;
			da = (0.50)*bsal;
		}

		double gsal= (bsal+hra+da);

		System.out.println("Gross Salary= "+gsal);
	}
}