package student;

import java.io.Serializable;
import java.util.Scanner;
public class EndSem implements Mark, Serializable{
    int mark;

    EndSem()
    {
        mark = 0;
    }

    EndSem(int m)
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
        System.out.println("Enter End Semester marks");
        mark  = sc.nextInt();
    }

    public String toString()
    {
        return "End Sem: "+ mark;
    }

    public void print()
    {
        System.out.println(toString());
    }

}
