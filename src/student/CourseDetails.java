package student;

import java.io.Serializable;
import java.util.Scanner;

public class CourseDetails implements Serializable {
	String degree;
	String course;
	String batch;
	String year;
	
	CourseDetails()
	{
		degree = "";
		course = "";
		batch = "";
		year = "";
	}
	
	CourseDetails(String d, String c, String b, String y)
	{
		degree = d;
		course = c;
		batch = b;
		year = y;
	}
	
	public String getDegree()
	{
		return degree;
	}
	
	public String getCourse()
	{
		return course;
	}
	
	public String getBatch()
	{
		return batch;
	}
	
	public String getYear()
	{
		return year;
	}
	
	public void setYear(String y)
	{
		year = y;
	}
	
	public void getCourseDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the degree you are currently pursuing");
		degree=sc.next();
		System.out.println("Enter the course");
		course=sc.next();
		System.out.println("Enter the batch");
		batch=sc.next();
		System.out.println("Which year are you in?");
		year=sc.next();
		
	}
	
	public void displayData() {
		System.out.println("Degree:"+degree);
		System.out.println("Course:"+course);
		System.out.println("Batch:"+batch);
		System.out.println("Year:"+year);
	}
	
	public String toString()
	{
		return degree + "\n"+ course + "\n" + batch + "\n" + year;
	}
	

	
	
}
