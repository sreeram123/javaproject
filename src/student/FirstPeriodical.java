package student;

import java.io.Serializable;
import java.util.Scanner;
public class FirstPeriodical implements Mark, Serializable {
    int mark;

    FirstPeriodical()
    {
        mark = 0;
    }

    FirstPeriodical(int m)
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
        System.out.println("Enter first periodical marks");
        mark  = sc.nextInt();
    }

    public String toString()
    {
        return "First Periodical: "+ mark;
    }

    public void print()
    {
        System.out.println(toString());
    }

}
