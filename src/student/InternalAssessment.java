package student;

import java.util.Scanner;
public class InternalAssessment {
    int mark;

    InternalAssessment()
    {
        mark = 0;
    }

    InternalAssessment(int m)
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

}