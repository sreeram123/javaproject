package student;

import java.io.Serializable;
import java.util.Scanner;
public class SecondPeriodical implements Mark, Serializable{
    int mark;

    SecondPeriodical()
    {
        mark = 0;
    }

    SecondPeriodical(int m)
    {
        mark = m;
    }

    public int getMark()
    {
        return mark;
    }

    public void setMark(int m)
    {
        mark = m;
    }

    public void addMark()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter second periodical marks");
        mark  = sc.nextInt();
    }

    public String toString()
    {
        return "Second Periodical: "+ mark;
    }

    public void print()
    {
        System.out.println(toString());
    }

}
