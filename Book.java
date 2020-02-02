import java.util.*;

class Book
{
	String bname;
	int price, pgs;
	void getdata()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Book Name");
		bname = in.nextLine();
		System.out.println("Enter Book Price");
		price = in.nextInt();
		System.out.println("Enter Number of Book Pages");
		pgs = in.nextInt();
	}
	void display(Book ref)
	{
		System.out.println("Book having greater price is");
		if(price>ref.price)
		{
			System.out.println("Book Name= "+bname);
			System.out.println("Book Price= "+price);
			System.out.println("Book Number of pages= "+pgs);
		}
		else
		{
			System.out.println("Book Name= "+ref.bname);
			System.out.println("Book Price= "+ref.price);
			System.out.println("Book Number of pages= "+ref.pgs);
		}
	}

	public static void main(String[] args)
	{
		Book b1 = new Book();
		Book b2 = new Book();
		b1.getdata();
		b2.getdata();
		b1.display(b2);
	}
}