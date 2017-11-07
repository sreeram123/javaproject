package student;

import java.io.Serializable;
import java.util.Scanner;
public class ContinuousAssessment implements Mark , Serializable {
    int mark;

    ContinuousAssessment()
    {
        mark = 0;
    }

    ContinuousAssessment(int m)
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
        System.out.println("Enter Continuous Assessment marks");
        mark  = sc.nextInt();
    }

    public String toString()
    {
        return "Continous assessment marks:"+mark;
    }

    public void print()
    {
        System.out.println(toString());
    }


}
