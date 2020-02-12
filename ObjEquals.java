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
class ObjEquals
{
	public static void main(String[] args)
	{
		Student s1 = new Student(10,"Yash");
		Student s2 = new Student(10,"Yash");
		System.out.println(s1.equals(s2));

	}
}
