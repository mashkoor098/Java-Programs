class A
{
	int x;
	void setX(int a)
	{
		x=a;
	}
}
class B extends A
{
	int y;
	void setY(int a)
	{
		y=a;
	}
}
class C extends B
{
	int z;
	void setZ(int a)
	{
		z=a;
	}
	void display()
	{
		System.out.println("X="+x);
		System.out.println("Y="+y);
		System.out.println("Z="+z);
	}
}
class Inheritance
{
	public static void main(String[] args)
	{
		C obj = new C();
		obj.setX(10);
		obj.setY(20);
		obj.setZ(30);
		obj.display();
	}
}