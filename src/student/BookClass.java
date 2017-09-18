package student;

import java.util.Scanner;

public class BookClass {
	String title;
	String author;
	
	BookClass()
	{
		title = "";
		author = "";
	}
	
	BookClass(String t, String aut)
	{
		title = t;
		author = aut;
	}
	
	public void setBookDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the title of the book");
		title = sc.next();
		System.out.println("Enter the author's name");
		author = sc.next();
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getRemark()
	{
		return author;
	}
	
	public String toString()
	{
		return title +"\n" + author + "\n";
	}
}
