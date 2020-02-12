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
class ObjClone
{
	public static void main(String[] args)
	{
		Student s1 = new Student(10,"Yash");
		Student s2 = s1.clone();
		System.out.println(s1);
		System.out.println(s2);
	}
}
