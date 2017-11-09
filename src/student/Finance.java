package student;

import java.io.Serializable;
import java.util.Scanner;
public class Finance implements Serializable {
    Dues departmentdue;
    int fees;
    int cd;

    Finance()
    {
        departmentdue = new Dues();
        fees = 0;
        cd = 5000;
    }

    Finance(int fee, int cautiond)
    {
        fees = fee;
        cd = cautiond;
    }

    public void addFinance()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fee amount");
        fees = sc.nextInt();
    }



    public void addDepartmentDue()
    {
        if(departmentdue.getFine()==0)
            departmentdue.newDue();
        else
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter fine amount");
            int f = sc.nextInt();
            f=f+departmentdue.getFine();
            departmentdue.setFine(f);
        }
    }

    public String toString()
    {
        return "Fee amount: " + fees + "\n" + "Caution Deposit: " + cd + " " +  departmentdue.toString();
    }

    public void printFinancials()
    {
        System.out.println(toString());
    }





}
