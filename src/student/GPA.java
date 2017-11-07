package student;

import java.io.Serializable;

public class GPA implements Serializable {
    float gpa;

    public GPA()
    {
        gpa = 0;
    }

    public void calculateGPA(Internals i, EndSem s)
    {
        gpa = (i.getMark()+(s.getMark()/2))/10;
    }

    public float getGPA()
    {
        return gpa;
    }

    public String toString()
    {
        return "GPA: "+gpa;
    }

    public void print()
    {
        System.out.println(toString());
    }

}
