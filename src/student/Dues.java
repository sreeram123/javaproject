package student;

import java.util.Scanner;
public class Dues {
	int fine;
	String remark;
	
	Dues()
	{
		fine = 0;
		remark = "";
	}
	
	Dues(int f, String r)
	{
		fine = f;
		remark = r;
	}
	
	public void setFine(int f)
	{
		fine = f;
	}
	
	public void setReason(String r)
	{
		remark = r;
	}
	
	public void newDue()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fine amount");
		fine = sc.nextInt();
		System.out.println("Enter the remarks");
		remark = sc.next();
	}
	
	public int getFine()
	{
		return fine;
	}
	
	public String getRemark()
	{
		return remark;
	}

	public String toString()
	{
		return "Fine: " + fine + "\n" + "Remarks: " + remark + "\n";
	}
	

}
