package student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class ParentDetails implements Serializable {
	
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
		System.out.println("Enter your father's phone number");
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
			FileInputStream fin = new FileInputStream("ParentDetail.ser");
			ObjectInputStream ois = new ObjectInputStream(fin);
			ParentDetails p = (ParentDetails) ois.readObject();
			this.dadname = p.dadname;
			this.momname = p.momname;
			this.email = p.email;
			this.pno = p.pno;
			this.occupation = p.occupation;
			fin.close();
		}catch (FileNotFoundException fnf){
			System.out.println(fnf);
			
		}catch (IOException ioe) {
			System.out.println(ioe);
		}catch (ClassNotFoundException cnf) {
			System.out.println(cnf);
		
		}
	}
	public void writeFile() {
		try {
			FileOutputStream fout = new FileOutputStream("ParentDetail.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			ParentDetails p = new ParentDetails(this.dadname, this.momname, this.email, this.pno, this.occupation);
			oos.writeObject(p);
			fout.close();
		}catch (FileNotFoundException fnf){
			System.out.println(fnf);
			
		}catch (IOException ioe) {
			System.out.println(ioe);
		
		}
	}
	
	public void displayData() {
		System.out.println("Dad's Name:"+dadname);
		System.out.println("Mom's Name:"+momname);
		System.out.println("Phone:"+pno);
		System.out.println("Email:"+email);
		System.out.println("Occupation:"+occupation);
	}
	
	public static void main(String args[])
	{
		ParentDetails p = new ParentDetails();
		p.getParentDetails();
		p.writeFile();
		p.readFile();
		p.displayData();
	}
	
	
	

}
