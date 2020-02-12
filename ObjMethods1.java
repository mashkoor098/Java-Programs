class Student
{
	int roll;
	String name;
	Student(int a, String b)
	{
		roll= a;
		name= b;
	}
	public String toString()
	{
		String str = "Roll no="+roll+",Name="+name;
		return str;
	}
}
class ObjMethods1
{
	public static void main(String[] args)
	{
		Student s = new Student(10,"Yash");
		System.out.println(s);
	}
}
