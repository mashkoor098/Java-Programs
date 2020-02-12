
abstract class Shape
{
	double dim1, dim2;
	Shape(double a, double b)
	{
		dim1= a;
		dim2= b;
	}
	abstract void area();
}
class Rectanglee extends Shape
{
	Rectanglee(double l, double b)
	{
		super(l,b);
	}
	void area()
	{
		System.out.println("Area of Rectangle= "+(dim1*dim2));
	}
}
class Circle extends Shape
{
	Circle(double r)
	{
		super(r,r);
	}
	void area()
	{
		System.out.println("Area of Circle= "+(3.14*dim1*dim1));
	}
}
class Triangle extends Shape
{
	Triangle(double b, double h)
	{
		super(b,h);
	}
	void area()
	{
		System.out.println("Area of Triangle= "+ ((dim1*dim2)/2));
	}
}
class DmdAbstract
{
	public static void main(String[] args)
	{
		Shape s;
		s= new Rectanglee(5,10);
		s.area();
		s= new Triangle(10,15);
		s.area();
		s= new Circle(20);
		s.area();

	}
}