package student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ParentDetails {
	
	String dadname;
	String momname;
	String email;
	String pno;
	String occupation;
	
	
	ParentDetails()
	{
		dadname = "";
		momname = "";
		email="";
		pno="";
		occupation="";
	}
	
	ParentDetails(String dname,String mname, String mail, String no,String occ)
	{
		dadname=dname;
		momname=mname;
		email=mail;
		pno=no;
		occupation=occ;
	}
	
	public String getDadName()
	{
		return dadname;
	}
	
	public String getMomName()
	{
		return momname;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public String getPhoneNo()
	{
		return pno;
	}
	
	public String getOccupation()
	{
		return occupation;
	}
	
	public void getParentDetails()
	{
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Father's Name");
		dadname=sc.next();
		System.out.println("Enter your Mother's Name");
		momname=sc.next();
		System.out.println("Enter your phone number");
		pno=sc.next();
		int l=pno.length();
		if(l!=10) throw new InvalidPhoneNoException();
		System.out.println("Enter the email");
		email=sc.next();
		String s = "@";
		if(!email.contains(s)) throw new InvalidEmailException();
		System.out.println("Enter father's occupation");
		occupation=sc.next();
		
		}
		
		catch(InvalidPhoneNoException e) {
			System.out.println(e);
			System.exit(0);
		}
		
		catch(InvalidEmailException i) {
			System.out.println(i);
			System.exit(0);
		}
	}
	
public void readFile() {
		
		try {
			FileInputStream f = new FileInputStream("Personal.ser");
			ObjectInputStream o = new ObjectInputStream(f);
			ParentDetails pd = (ParentDetails)o.readObject();
			dadname=pd.getDadName();
			momname=pd.getMomName();
			pno  = pd.getPhoneNo();
			email = pd.getEmail();
			occupation=pd.getOccupation();
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
	}
	
	public void writeToFile() {
		try {
			FileOutputStream f = new FileOutputStream("Personal.ser");
			ObjectOutputStream o = new ObjectOutputStream(f);
			ParentDetails s = new ParentDetails(dadname,momname,email,pno,occupation);
			o.writeObject(s);
			f.close();
		}
		
		catch(FileNotFoundException fof) {
			System.out.println("File not found!");
		}
		
		catch(IOException ioe) {
			System.out.println("File may be corrupt!");
		}	
	}
	
	public void displayData() {
		System.out.println("Dad's Name:"+dadname);
		System.out.println("Mom's Name:"+momname);
		System.out.println("Phone:"+pno);
		System.out.println("Email:"+email);
		System.out.println("Occupation:"+occupation);
	}
	
	//test
	
	
	

}
