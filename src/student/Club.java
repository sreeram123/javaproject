package student;

import java.util.Scanner;

public class  Club {
    String c;

    Club(){
        c = "";
    }
    public void addDetail(){
        System.out.println("Enter the club you belong to,otherwise enter NIL");
        Scanner sc = new Scanner(System.in);
        c=sc.next();

    }

    public String getClub()
    {
        return c;
    }

    public void setClub(String s)
    {
        this.c=s;
    }

    public String toString(){
        return "Club" + c;
    }
    public void print(){
        System.out.println(this.toString());
    }
}

