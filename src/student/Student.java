package student;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Student implements Serializable {
	String name;
	String roll;
	Date dob;
	String campus;
	
	Student(){
		campus=" ";
		name = " ";
		roll = " ";
		Calendar c = Calendar.getInstance();
		c.set(2000, 1, 1);
		dob=c.getTime();
	}
	
	Student(String n, String r, String c, Date d){
		name = n;
		roll = r;
		campus = c;
		dob = d;
	}
	
	public String getName() {
		return name;
	}
	
	public String getRoll() {
		return roll;
	}
	
	public String getCampus() {
		return campus;
	}
	
	public Date getDate() {
		return dob;
	}
	
	public void getStudentData() {
		Scanner sc = new Scanner(System.in);
		int year,month,day;
		System.out.println("Enter your name");
		name=sc.next();
		System.out.println("Enter your roll number");
		roll=sc.next();
		System.out.println("Which campus do you study in?");
		campus=sc.next();
		System.out.println("Enter your birthday in YYYY, MM, DD format");
		year = sc.nextInt();
		month = sc.nextInt();
		day = sc.nextInt();
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, day);
		dob=cal.getTime();
	}
	
	public static Student readFile() {
		
		try {
			FileInputStream f = new FileInputStream("Student.ser");
			ObjectInputStream o = new ObjectInputStream(f);
			Student st = (Student)o.readObject();
			Student s = new Student(st.getName(), st.getRoll(), st.getCampus(), st.getDate());
			return s;
		}
		
		catch(FileNotFoundException fof) {
			System.out.println("File not found!");
		}
		
		catch(IOException ioe) {
			System.out.println("File may be corrupt!");
		}
		
		catch(ClassNotFoundException cnf) {
			System.out.println("Class not found!");
		}
		return null;
	}
	
	public static void writeToFile(Student st) {
		try {
			FileOutputStream f = new FileOutputStream("Student.ser", true);
			ObjectOutputStream o = new ObjectOutputStream(f);
			Student s = new Student(st.name,st.roll,st.campus,st.dob);
			o.writeObject(s);
		}
		
		catch(FileNotFoundException fof) {
			System.out.println("File not found!");
		}
		
		catch(IOException ioe) {
			System.out.println("File may be corrupt!");
		}	
	}
	
	public void displayData() {
		System.out.println("Name:"+name);
		System.out.println("Roll Number:"+roll);
		System.out.println("Campus:"+campus);
		SimpleDateFormat d = new SimpleDateFormat("dd/mm/yyyy");
		System.out.println(d.format(dob));
		
	}
	
	public static void main(String args[])
	{
		Student p = new Student();
		Student s = new Student();
		p.getStudentData();
		s.getStudentData();
		Student.writeToFile(p);
		Student.writeToFile(s);
		p=Student.readFile();
		p.displayData();
		s=Student.readFile();
		s.displayData();
	}
	
}