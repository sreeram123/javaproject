package student;

import java.util.Scanner;
public class EndSem {
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
        System.out.println("Enter the mark");
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
