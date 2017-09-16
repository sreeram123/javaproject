package student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Personal implements Serializable{
	
	String phone;
	String address;
	String email;
	
	Personal()
	{
		phone = "";
		address = "";
		email="";
	}
	
	Personal(String p,String a,String e)
	{
		phone=p;
		address=a;
		email=e;
	}
	
	public String getPhone()
	{
		return phone;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void getPersonalData()
	{
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your phone number");
		phone=sc.next();
		int l=phone.length();
		if(l!=10) throw new InvalidPhoneNoException();
		System.out.println("Enter the address");
		address=sc.next();
		System.out.println("Enter the email");
		email=sc.next();
		String s = "@";
		if(!email.contains(s)) throw new InvalidEmailException();
		
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
			Personal p = (Personal)o.readObject();
			phone  = p.getPhone();
			address = p.getAddress();
			email = p.getEmail();
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
			Personal s = new Personal(phone,address,email);
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
		System.out.println("Phone:"+phone);
		System.out.println("Address:"+address);
		System.out.println("Email:"+email);
	}
	
	public static void main(String args[])
	{
		Personal p = new Personal();
		p.getPersonalData();
		p.writeToFile();
		p.readFile();
		p.displayData();
	}
		
	
}